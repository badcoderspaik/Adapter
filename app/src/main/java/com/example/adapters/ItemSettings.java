package com.example.adapters;

public class ItemSettings
{
	int icon;
	String settings;
	String about;
	
	public ItemSettings(int icon, String settings, String about){
		this.icon = icon;
		this.settings = settings;
		this.about = about;
	}
	
	public int getIcon(){
		return this.icon;
	}
	
	public void setIcon(int icon){
		this.icon = icon;
	}
	
	public String getSettings(){
		return this.settings;
	}

	public void setSettings(String settings){
		this.settings = settings;
	}
	
	public String getAbout(){
		return this.about;
	}

	public void setAbout(String about){
		this.about = about;
	}
}
