package com.example.roonner;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class PersonalResults extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_results);
		Random random_gen= new Random();
		int random = random_gen.nextInt(8);
		chooseImage(random);
		Button personalResults_friendResults = (Button)findViewById(R.id.personalResults_friendResults);
		personalResults_friendResults.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				Bundle extras = intent.getExtras();
				Intent nextIntent = new Intent(getBaseContext(),FriendResults.class);
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

	public void chooseImage(int number){
		QuickContactBadge friend = (QuickContactBadge)findViewById(R.id.friend_results_pic);
		try{
			if(number == 0){
				friend.setImageResource(R.drawable.sun);
			}
			else if(number == 1){friend.setImageResource(R.drawable.cloudy);}
			else if(number == 2){friend.setImageResource(R.drawable.light_snow);}
			else if(number == 3){friend.setImageResource(R.drawable.rain);}
			else if(number == 4){friend.setImageResource(R.drawable.rain2);}
			else if(number == 5){friend.setImageResource(R.drawable.semi_sun);}
			else if(number == 6){friend.setImageResource(R.drawable.snow);}
			else if(number == 7){friend.setImageResource(R.drawable.thunder);}
			else if(number == 8){friend.setImageResource(R.drawable.very_cloudy);}
		}
		catch(Exception e){}
	}

}
