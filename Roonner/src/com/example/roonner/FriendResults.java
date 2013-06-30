package com.example.roonner;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class FriendResults extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friend_results);
		Random random_gen= new Random();
		int random = random_gen.nextInt(8);
		chooseImage(random);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void chooseImage(int number){
		QuickContactBadge friend = (QuickContactBadge)findViewById(R.id.friend_results_pic);
		if(number == 0){
			friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/sun" , null, null));
		}
		else if(number == 1){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/cloudy" , null, null));}
		else if(number == 2){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/light_snow" , null, null));}
		else if(number == 3){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/rain" , null, null));}
		else if(number == 4){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/rain2" , null, null));}
		else if(number == 5){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/semi_sun" , null, null));}
		else if(number == 6){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/snow" , null, null));}
		else if(number == 7){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/thunder" , null, null));}
		else if(number == 8){friend.setImageResource(getResources().getIdentifier("com.example.roonner:drawable/very_cloudy" , null, null));}
	}

}
