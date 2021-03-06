package com.mphare.ListAdapters.SimpleAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mphare.ListAdapters.R;

public class MySimpleActivity extends ListActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    String[] values = new String[]{"Google", "Apple", "Microsoft", "Oracle", "DEC", "DRI", "SCO", "Yahoo",
                                   "Facebook", "Sun", "IBM", "Rational", "Samsung", "HTC", "LG", "Xiaomi"};

//    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
//    setListAdapter(adapter);
    setListAdapter(new MyPerformanceArrayAdapter(this, values));

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_my_simple, menu);
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
