package com.example.assigment3_multi_3activities;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SharedPreferences getPreference = PreferenceManager.getDefaultSharedPreferences(this);
		boolean checked = getPreference.getBoolean("checkbox1", false);
		if (checked == true){
			Button btn = (Button) findViewById(R.id.btn);
			btn.setTextAppearance(this,R.style.label1 );
			
		}	
		
	}

	public void NextActivity(View view){
		Intent intent = new Intent(this,NewActivity.class);
		startActivity(intent);
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if(item.getItemId() ==R.id.action_settings)
		{
			Intent intent = new Intent(this,Settings.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
	
   

