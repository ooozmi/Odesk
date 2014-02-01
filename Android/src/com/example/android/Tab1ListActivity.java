package com.example.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tab1ListActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab1_list);
		
		Button listButton =(Button) findViewById(R.id.listbutton1);
		listButton.setOnClickListener(this);

		Button listButton1 =(Button) findViewById(R.id.listbutton2);
		listButton1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab1_list, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.listbutton1:
			setContentView(R.layout.activity_tab1);
			break;
		case R.id.listbutton2:
			setContentView(R.layout.activity_tab1); //map
			break;
		default:
			break;
		}
		
		
	}

}
