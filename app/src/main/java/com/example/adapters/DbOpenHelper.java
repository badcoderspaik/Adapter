package com.example.adapters;
import android.database.sqlite.*;
import android.content.*;
import android.widget.*;
import android.renderscript.*;
import android.database.*;

public class DbOpenHelper extends SQLiteOpenHelper implements SqliteHelperInterface
{
	Context context;
	public DbOpenHelper(Context context){
		super(context, DB_NAME, null, DB_VERSION);
		//this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(DB_CREATE);
		//Toast.makeText(context, "db created", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int p2, int p3)
	{
		db.execSQL("DROP TABLE IF NOT EXISTS "+TABLE_NAME);
		onCreate(db);
	}

//	@Override
//	public void getFullTable()
//	{
//		SQLiteDatabase reader = getReadableDatabase();
//		Cursor cursor = reader.rawQuery("SELECT * FROM "+TABLE_NAME+";", null);
//		if(cursor.moveToFirst()){
//			do{
////				Toast.makeText(context, cursor.getString(1), Toast.LENGTH_SHORT).show();
////				Toast.makeText(context, cursor.getString(2), Toast.LENGTH_SHORT).show();
////				Toast.makeText(context, cursor.getString(3), Toast.LENGTH_SHORT).show();
////				Toast.makeText(context, cursor.getString(4), Toast.LENGTH_SHORT).show();
//			}while(cursor.moveToNext());
//		}
//		cursor.close();
//	}
//	
	public Cursor getAllRecords(){
		SQLiteDatabase reader = getReadableDatabase();
		Cursor cursor = reader.rawQuery("SELECT * FROM "+TABLE_NAME+";", null);
		return cursor;
	}
//
//	@Override
//	public void addRecord(String[] values)
//	{
//		SQLiteDatabase writer = getWritableDatabase();
//		ContentValues map = new ContentValues();
//		
//		map.put(NAME, values[0]);
//		map.put(LAST_NAME, values[1]);
//		map.put(OLD, values[2]);
//		map.put(COUNTRY, values[3]);
//		
//		writer.insert(TABLE_NAME, null, map);
//	}

}
