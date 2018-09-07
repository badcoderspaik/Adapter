package com.example.adapters;

public interface SqliteHelperInterface
{
	public static String DB_NAME = "example.db";
	public static String TABLE_NAME = "example";
	public static final int DB_VERSION = 1;
	
	public static String ID = "_id";
	public static String NAME = "name";
	public static String LAST_NAME = "last_name";
	public static String OLD ="old";
	public static String COUNTRY = "country";
	
	public static String DB_CREATE = "CREATE TABLE "+TABLE_NAME+"("+ID+" integer primary key autoincrement,"+NAME+" text,"+LAST_NAME+" text,"+OLD+" text,"+COUNTRY+" text)";
	
//	public void addRecord(String[] values);
//	public void getFullTable();
}
