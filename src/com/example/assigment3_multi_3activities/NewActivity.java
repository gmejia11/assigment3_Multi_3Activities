package com.example.assigment3_multi_3activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class NewActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		SharedPreferences getPreference = PreferenceManager.getDefaultSharedPreferences(this);
		boolean checked = getPreference.getBoolean("checkbox2", false);
		if (checked == true){
			Button button3 = (Button) findViewById(R.id.button3);
			button3.setTextAppearance(this,R.style.label1 );
		}	
	}

	
	public void FinalPage(View view){
		Intent intent = new Intent(this,LastActivity.class);
		startActivity(intent);

      }
}
