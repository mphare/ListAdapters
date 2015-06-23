package com.mphare.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mphare on 6/22/2015.
 */
public class CustomAdapter extends ArrayAdapter<String>
{
  private final Context  context;
  private final String[] values1;
  private final String[] values2;

  public CustomAdapter(Context context, String[] values1, String[] values2)
  {
    super(context, -1, values1);
    this.context = context;
    this.values1 = values1;
    this.values2 = values2;

  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    View rowView = inflater.inflate(R.layout.custom_row, parent, false);

    TextView firstTextView = (TextView) rowView.findViewById(R.id.firstLine);
    TextView secondTextView = (TextView) rowView.findViewById(R.id.secondLine);
    ImageView iconView = (ImageView) rowView.findViewById(R.id.icon);

    firstTextView.setText(values1[position]);
    secondTextView.setText(values2[position]);
    iconView.setImageResource(R.drawable.ic_launcher);

    return rowView;
  }

}
