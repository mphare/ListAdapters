package com.mphare.ListAdapters.ListLayout;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.mphare.ListAdapters.R;

public class ListLayoutActivity extends ListActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_layout);
    String[] values = new String[]{"Intel", "AMD", "Cyrix", "Motorola", "DEC", "SUN", "MIPS"};

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.label, values);
    setListAdapter(adapter);

  }

  @Override
  public void onListItemClick(ListView listView, View view, int position, long id)
  {
    String item = (String) getListAdapter().getItem(position);
    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_list_layout, menu);
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
