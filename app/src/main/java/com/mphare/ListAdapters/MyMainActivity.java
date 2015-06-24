package com.mphare.ListAdapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mphare.ListAdapters.Curosr.CursorActivity;
import com.mphare.ListAdapters.Custom.CustomActivity;
import com.mphare.ListAdapters.ListLayout.ListLayoutActivity;
import com.mphare.ListAdapters.SimpleAdapter.MySimpleActivity;
import com.mphare.ListAdapters.SimpleFragment.SimpleFragmentActivity;
import com.mphare.ListAdapters.StableAdapter.StableListActivity;

public class MyMainActivity extends Activity
{
  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void gotoListView(View view)
  {
    Intent intent = new Intent(this, StableListActivity.class);
    startActivity(intent)
    ;
  }

  public void gotoCustomView(View view)
  {
    Intent intent = new Intent(this, CustomActivity.class);
    startActivity(intent);
  }

  public void gotoSimpleFragmentActivity(View view)
  {
    Intent intent = new Intent(this, SimpleFragmentActivity.class);
    startActivity(intent);
  }

  public void gotoListLayout(View view)
  {
    Intent intent = new Intent(this, ListLayoutActivity.class);
    startActivity(intent);
  }

  public void gotoSimpleLayout(View view)
  {
    Intent intent = new Intent(this, MySimpleActivity.class);
    startActivity(intent);
  }

  public void gotoCursorActivity(View view)
  {
    Intent intent = new Intent(this, CursorActivity.class);
    startActivity(intent);
  }

}
