package com.example.myactionbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class MainActivity extends SherlockActivity {

	private ActionBar actionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		actionBar = getSupportActionBar();
		actionBar.setTitle("new title");
		actionBar.setHomeButtonEnabled(true);
	}
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()){
		case R.id.subItem1:
			break;
		case R.id.subItem2:
			break;
		case R.id.subItemstart1:
			break;
		case R.id.subItemstart2:
			break;
		}
		return super.onOptionsItemSelected(item);
	}



	@Override
	//actionbarsherlock -> onCreateOptionMenu
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		// TODO Auto-generated method stub
//		MenuInflater menInflater= getSupportMenuInflater();
//		menInflater.inflate(R.menu.main, menu);
		
		
		//°ÊºA²£¥Ísubmenu
		SubMenu submenu1 = menu.addSubMenu("start");
		submenu1.add("subItemstart1");
		submenu1.add("subItemstart2");
		submenu1.add("subItemstart3");
		
		MenuItem subMenuItem = submenu1.getItem();
		subMenuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		
		return super.onCreateOptionsMenu(menu);
	}


/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
*/
}
