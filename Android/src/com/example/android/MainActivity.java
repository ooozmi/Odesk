package com.example.android;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	private TabHost mtabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Resources res = getResources();
        mtabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab1Activity.class);
        
        spec = mtabHost.newTabSpec("Tab1Activity").setIndicator("",res.getDrawable(R.drawable.tab01)).setContent(intent);
        mtabHost.addTab(spec);
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab2Activity.class);
        
        spec = mtabHost.newTabSpec("Tab2Activity").setIndicator("",res.getDrawable(R.drawable.tab02)).setContent(intent);
        mtabHost.addTab(spec);
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab3Activity.class);
        
        spec = mtabHost.newTabSpec("Tab3Activity").setIndicator("",res.getDrawable(R.drawable.tab03)).setContent(intent);
        mtabHost.addTab(spec);
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab4Activity.class);
        
        spec = mtabHost.newTabSpec("Tab4Activity").setIndicator("",res.getDrawable(R.drawable.tab04)).setContent(intent);
        mtabHost.addTab(spec);
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab5Activity.class);
        
        spec = mtabHost.newTabSpec("Tab5Activity").setIndicator("",res.getDrawable(R.drawable.tab05)).setContent(intent);
        mtabHost.addTab(spec);
        
        //Tab1Activity
        intent = new Intent(getApplicationContext(),Tab6Activity.class);
        
        spec = mtabHost.newTabSpec("Tab6Activity").setIndicator("",res.getDrawable(R.drawable.tab06)).setContent(intent);
        mtabHost.addTab(spec);
        
        mtabHost.setCurrentTab(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
