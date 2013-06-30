package com.example.roonner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class Profile extends Activity {
private List<Map<String, String>> data = new ArrayList<Map<String, String>>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		setNames();
		ListView profile_music=(ListView)findViewById(R.id.list_roonners);
		SimpleAdapter adapter = new SimpleAdapter(this, data,
		        android.R.layout.simple_list_item_2, 
		        new String[] { "name","place" }, 
		        new int[] { android.R.id.text1, android.R.id.text2 });
		
		profile_music.setAdapter(adapter);
		profile_music.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent nextIntent = new Intent(getBaseContext(),Music.class);
				nextIntent.putExtra("name", data.get(arg2).get("name"));
				nextIntent.putExtra("place",data.get(arg2).get("place"));
				startActivityForResult(nextIntent,0);
			}});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void setNames(){
		Map<String, String> uno = new HashMap<String, String>(2);
		uno.put("name", "Cristobal");
		uno.put("place", "Santiago,Chile");
		data.add(uno);
		uno = new HashMap<String, String>(2);
		uno.put("name", "Mohammed");
		uno.put("place", "London,England");
		data.add(uno);
		uno = new HashMap<String, String>(2);
		uno.put("name", "Alyssa");
		uno.put("place", "Atlanta,USA");
		data.add(uno);
		uno = new HashMap<String, String>(2);
		uno.put("name", "Ming");
		uno.put("place", "Seoul,South Korea");
		data.add(uno);
		uno = new HashMap<String, String>(2);
		uno.put("name", "Bruce");
		uno.put("place", "Melbourne,Australia");
		data.add(uno);
	}
	

}
