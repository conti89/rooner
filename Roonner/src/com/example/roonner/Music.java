package com.example.roonner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Music extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music);
		Button music_run = (Button)findViewById(R.id.music_run);
		music_run.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				Bundle extras = intent.getExtras();
				Intent nextIntent = new Intent(getBaseContext(),Run.class);
				nextIntent.putExtra("name", extras.getString("name"));
				nextIntent.putExtra("place",extras.getString("place"));
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
