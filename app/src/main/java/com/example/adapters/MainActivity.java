package com.example.adapters;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.util.*;
import android.view.View.*;
import android.view.*;
import android.widget.AdapterView.*;
import android.content.*;

public class MainActivity extends Activity 
{
	ListView arrayAdaptersListView;
	ArrayList<String> arrayAdaptersArrayList;
	String[] arrayAdaptersStringArray;
	ArrayAdapter<String> adaptersArrayAdapter;
	
	private void showMessage(String message){
		Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
		toast.show();
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		arrayAdaptersListView = (ListView)findViewById(R.id.mainListView1);
		arrayAdaptersArrayList = new ArrayList<String>();
		arrayAdaptersStringArray = getResources().getStringArray(R.array.adapters);
		
		for(int i=0; i<arrayAdaptersStringArray.length; i++){
			arrayAdaptersArrayList.add(arrayAdaptersStringArray[i]);
		}
		
		adaptersArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayAdaptersArrayList);
		arrayAdaptersListView.setAdapter(adaptersArrayAdapter);
		
		OnItemClickListener clickListener = new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> p1, View view, int position, long id)
			{
				Intent intent;
				//Toast.makeText(MainActivity.this, String.valueOf(id), Toast.LENGTH_SHORT).show();
				switch(position){
					case 0:
						intent = new Intent(getApplicationContext(), SettingsActivity.class);
						startActivity(intent);
						break;
					case 2:
						intent = new Intent(MainActivity.this, SimpleCursorAdapterActivity.class);
						startActivity(intent);
						break;
				}
			}
	
		};
		arrayAdaptersListView.setOnItemClickListener(clickListener);
		
		DbOpenHelper db = new DbOpenHelper(this);
//		String[] values = {"Alex", "Tod", "33","usa"};
//		db.addRecord(values);
		//db.getFullTable();
		
    }
}
