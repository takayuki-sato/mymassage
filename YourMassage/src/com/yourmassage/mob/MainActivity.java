package com.yourmassage.mob;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.DroidGap;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class MainActivity extends DroidGap {

	private String ACTIVITY_MAIN = "file:///android_asset/www/index.html";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        /*Parse.initialize(this, "g6hoh7SmabmGts4dSs6mOn1KoLoPjUAPDgoQFgb2", "odLiHrJHgJQNz84PJxeWqsLtIeY3Va0T12BTHgBh"); 
        ParseAnalytics.trackAppOpened(getIntent());
        
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();*/
        
        super.loadUrl(ACTIVITY_MAIN);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
