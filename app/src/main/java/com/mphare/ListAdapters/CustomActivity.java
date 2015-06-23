package com.mphare.ListAdapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class CustomActivity extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_custom);

    String[] values1 = new String[]{"Android", "iOS", "Windows", "Linux", "Solaris", "VMS", "CPM", "DOS"};
    String[] values2 = new String[]{"Google", "Apple", "Microsoft", "Linus", "SUN", "DEC", "DRI", "Microsoft"};
    final ArrayList<String> list1 = new ArrayList<String>();
    for (int i = 0; i < values1.length; ++i)
    {
      list1.add(values1[i]);
    }
    final ArrayList<String> list2 = new ArrayList<String>();
    for (int i = 0; i < values2.length; ++i)
    {
      list2.add(values2[i]);
    }

    final CustomAdapter adapter = new CustomAdapter(this, values1, values2);

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
