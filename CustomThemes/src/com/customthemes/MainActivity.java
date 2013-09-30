package com.customthemes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * English version
	 * */
	public void translateToEnglish(View view){
		TextView text = (TextView)findViewById(R.id.text);
//		Button button = (Button)findViewById(R.id.button_en);
//		text.setText(button.getText().toString());
		text.setText("English version");
		text.setTextSize(30);
	}	
	
	
	/**
	 * French version
	 * */
	public void translateToFrench(View view){
		TextView text = (TextView)findViewById(R.id.text);
		text.setText("French version");
		text.setTextSize(30);
	}
	
	/**
	 * Get simple theme
	 * */
	public void changeToSimpleTheme(View view){
		TextView text = (TextView)findViewById(R.id.text);
		text.setText("Simple theme");
		text.setTextSize(30);
	}
	
	/**
	 * Get colorful theme
	 * */
	public void changeToColorfulTheme(View view){
		TextView text = (TextView)findViewById(R.id.text);
		text.setText("Colorful theme");
		text.setTextSize(30);
	}
}
