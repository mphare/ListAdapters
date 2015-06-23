package com.mphare.ListAdapters.SimpleAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mphare.ListAdapters.R;

/**
 * Created by mphare on 6/22/2015.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<String>
{
  private final Context  context;
  private final String[] values;

  public MySimpleArrayAdapter(Context context, String[] values)
  {
    super(context, -1, values);
    this.context = context;
    this.values = values;

  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    View rowView = inflater.inflate(R.layout.custom_row, parent, false);

    TextView firstTextView = (TextView) rowView.findViewById(R.id.firstLine);
    ImageView iconView = (ImageView) rowView.findViewById(R.id.icon);

    firstTextView.setText(values[position]);
    iconView.setImageResource(R.drawable.ic_launcher);

    return rowView;
  }
}
