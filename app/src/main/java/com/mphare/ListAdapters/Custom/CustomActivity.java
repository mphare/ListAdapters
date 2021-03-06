package com.mphare.ListAdapters.Custom;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mphare.ListAdapters.R;

import java.util.ArrayList;

public class CustomActivity extends ListActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    String[] values1 = new String[]{"Pentium", "Athlon", "PowerPC", "MIPS", "SPARC", "Alpha", "Z80", "Xeon", "6502",
                                    "8080", "Opteron"};
    String[] values2 = new String[]{"Intel", "AMD", "Motorola", "MIPS", "SUN", "DEC", "Zilog", "Intel", "Motorola",
                                    "Intel", "AMD"};

    ArrayList<CustomBean> customBeanList = new ArrayList<CustomBean>();

    for (int i = 0; i < values1.length; ++i)
    {
      CustomBean bean = new CustomBean(values1[i], values2[i]);
      customBeanList.add(bean);
    }

    CustomAdapter adapter = new CustomAdapter(this, customBeanList);
    setListAdapter(adapter);

    ListView listView = getListView();
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id)
      {
        Toast.makeText(CustomActivity.this, "Item in position " + position + " clicked", Toast.LENGTH_LONG).show();

      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_custom, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings)
    {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
