package com.example.roonner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Buddies extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buddies);
		
		Button buddies_profile = (Button)findViewById(R.id.buddies_profile);
		buddies_profile.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent nextIntent = new Intent(getBaseContext(),Profile.class);
				startActivityForResult(nextIntent, 0);
			}});
		Button buddies_listBuddies = (Button)findViewById(R.id.buddies_listBuddies);
		buddies_listBuddies.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent nextIntent = new Intent(getBaseContext(),ListBuddies.class);
				startActivityForResult(nextIntent, 0);
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
