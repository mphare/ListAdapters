package com.mphare.ListAdapters.Curosr;

import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.mphare.ListAdapters.R;

public class CursorActivity extends ListActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    Cursor mCursor = getContacts();
    startManagingCursor(mCursor);

    ListAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item, mCursor, new String[]
        {ContactsContract.Contacts._ID, ContactsContract.Contacts.DISPLAY_NAME}, new int[]{android.R.id.text1,
                                                                                           android.R.id.text2});
    setListAdapter(adapter);
    ListView listView = getListView();
    listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      @Override public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
      {
        Toast.makeText(CursorActivity.this, "Item in position " + position + " clicked", Toast.LENGTH_LONG).show();
        return true;
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_cursor, menu);
    return true;
  }

  private Cursor getContacts()
  {
    Uri uri = ContactsContract.Contacts.CONTENT_URI;
    String[] projection = new String[]{ContactsContract.Contacts._ID, ContactsContract.Contacts.DISPLAY_NAME};
    String selection = ContactsContract.Contacts.IN_VISIBLE_GROUP + " = '" + ("1") + "'";
    String[] selectionArgs = null;
    String sortOrder = ContactsContract.Contacts.DISPLAY_NAME + " COLLATE LOCALIZED ASC";

    return managedQuery(uri, projection, selection, selectionArgs, sortOrder);
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
