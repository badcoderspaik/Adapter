package com.example.adapters;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.database.Cursor;

public class SimpleCursorAdapterActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ListView listView = (ListView)findViewById(R.id.mainListView1);
		DbOpenHelper db = new DbOpenHelper(this);
		Cursor cursor = db.getAllRecords();
		
		startManagingCursor(cursor);
		String[] from = {"name", "last_name"};
		int[] to = {R.id.name, R.id.lastname};
		SimpleCursorAdapter sca = new SimpleCursorAdapter(this, R.layout.cursor_records, cursor, from, to);
		listView.setAdapter(sca);
	}
	
}
