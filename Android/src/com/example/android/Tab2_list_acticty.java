package com.example.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tab2_list_acticty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab2_list_acticty);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab2_list_acticty, menu);
		return true;
	}

}
