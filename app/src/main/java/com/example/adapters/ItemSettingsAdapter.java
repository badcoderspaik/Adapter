package com.example.adapters;
import android.content.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class ItemSettingsAdapter extends ArrayAdapter<ItemSettings>
{
	private LayoutInflater inflater;
	int layout;
	private ArrayList<ItemSettings> itemSettings;
	
	public ItemSettingsAdapter(Context context, int layout, ArrayList<ItemSettings> itemSettings){
		super(context, layout, itemSettings);
		inflater = LayoutInflater.from(context);
		this.layout = layout;
		this.itemSettings = itemSettings;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View view = inflater.inflate(layout, parent, false);
		
		ImageView settingImage = (ImageView)view.findViewById(R.id.item_settingsImageView);
		TextView itemSettingsTextView = (TextView)view.findViewById(R.id.itemSettingsTextView);
		TextView itemAboutTextView = (TextView)view.findViewById(R.id.itemAboutTextView);
		
		settingImage.setImageResource(itemSettings.get(position).getIcon());
		itemSettingsTextView.setText(itemSettings.get(position).getSettings());
		itemAboutTextView.setText(itemSettings.get(position).getAbout());
		
		return view;
	}
	
}
