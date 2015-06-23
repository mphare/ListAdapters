package com.mphare.ListAdapters.Custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mphare.ListAdapters.R;

import java.util.ArrayList;

/**
 * Created by mphare on 6/22/2015.
 */
public class CustomAdapter extends ArrayAdapter<CustomBean>
{
  private final Context               context;
  private final ArrayList<CustomBean> customBeans;

  public CustomAdapter(Context context, ArrayList<CustomBean> customBeans)

  {
    super(context, R.layout.custom_row, customBeans);
    this.context = context;

    this.customBeans = customBeans;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {

    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    View rowView = inflater.inflate(R.layout.custom_row, parent, false);

    TextView firstTextView = (TextView) rowView.findViewById(R.id.firstLine);
    TextView secondTextView = (TextView) rowView.findViewById(R.id.secondLine);
    ImageView iconView = (ImageView) rowView.findViewById(R.id.icon);

    CustomBean bean = customBeans.get(position);
    firstTextView.setText(bean.getName());
    secondTextView.setText(bean.getMaker());
    iconView.setImageResource(R.drawable.ic_launcher);

    return rowView;
  }

}
