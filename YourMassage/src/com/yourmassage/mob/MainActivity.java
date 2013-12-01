package com.yourmassage.mob;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.DroidGap;

public class MainActivity extends DroidGap {

	private String ACTIVITY_MAIN = "file:///android_asset/www/index.html";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl(ACTIVITY_MAIN);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
