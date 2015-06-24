package com.mphare.ListAdapters.SimpleAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mphare.ListAdapters.R;

/**
 * Created by mphare on 6/23/2015.
 */
public class MyPerformanceArrayAdapter extends ArrayAdapter<String>
{
  private final Activity context;
  private final String[] values;

  static class ViewHolder
  {
    public TextView  textView;
    public ImageView imageView;
  }

  public MyPerformanceArrayAdapter(Activity context, String[] values)
  {
    super(context, R.layout.custom_row, values);
    this.context = context;
    this.values = values;

  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    View rowView = convertView;

    if (rowView == null)
    {
      LayoutInflater inflater = context.getLayoutInflater();
      rowView = inflater.inflate(R.layout.custom_row, null);

      ViewHolder viewHolder = new ViewHolder();
      viewHolder.textView = (TextView) rowView.findViewById(R.id.secondLine);
      viewHolder.imageView = (ImageView) rowView.findViewById(R.id.icon);
      rowView.setTag(viewHolder);
    }
    ViewHolder viewHolder = (ViewHolder) rowView.getTag();
    String s = values[position];
    viewHolder.textView.setText(s);
    viewHolder.imageView.setImageResource(R.drawable.ic_launcher);

    return rowView;
  }

}
