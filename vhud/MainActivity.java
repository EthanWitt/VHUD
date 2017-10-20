package com.teameight.vhud;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button dashboardButton = (Button) findViewById(R.id.dashboardButton);
		Button gpsButton = (Button) findViewById(R.id.gpsButton);
		Button destinationButton = (Button) findViewById(R.id.destinationButton);
		Button engineButton = (Button) findViewById(R.id.engineButton);
		Button musicButton = (Button) findViewById(R.id.musicButton);
		Button settingsButton = (Button) findViewById(R.id.settingsButton);
		
		dashboardButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.teameight.vhud.DASHBOARD"));
			}
		});
		
		gpsButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri location = Uri.parse("geo:0,0");
				startActivity(new Intent(Intent.ACTION_VIEW, location));
			}
		});
		
		destinationButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.teameight.vhud.DESTINATION"));
			}
		});
		
		engineButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.teameight.vhud.ENGINE"));
			}
		});
		
		musicButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//startActivity(new Intent("com.teameight.vhud.MUSIC"));
				Intent intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
				startActivity(intent);
			}
		});
		
		settingsButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("com.teameight.vhud.SETTINGS"));
			}
		});
		
	}
	
	@Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
