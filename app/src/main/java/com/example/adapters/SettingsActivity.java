package com.example.adapters;
import android.app.*;
import java.util.*;
import android.widget.*;
import android.os.*;
import android.content.*;

public class SettingsActivity extends Activity
{
	ListView arrayAdaptersListView;
	ArrayList<ItemSettings> itemSettings;
	ItemSettingsAdapter itemSettingsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		arrayAdaptersListView = (ListView)findViewById(R.id.mainListView1);
		itemSettings = new ArrayList();
		itemSettingsAdapter = new ItemSettingsAdapter(this, R.layout.item_settings, itemSettings);
//		
		arrayAdaptersListView.setAdapter(itemSettingsAdapter);
		itemSettings.add(new ItemSettings(android.R.drawable.star_big_on, "Экран", "Настройки экрана: яркость, спящий режим, режим экономии"));
		itemSettings.add(new ItemSettings(android.R.drawable.sym_action_call, "Телефония", "Настройки телефонии: яркость, спящий режим, режим экономии"));
		String message = getIntent().getAction();
		Toast.makeText(this, message, 500).show();
	}
	
	
}
