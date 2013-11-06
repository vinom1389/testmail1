package com.example.phonegapexample;

import org.apache.cordova.*;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.Menu;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl(Config.getStartUrl());
		
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
        public void run() {
        	
            Intent mInHome = new Intent(MainActivity.this, Page2.class);
            MainActivity.this.startActivity(mInHome);
            MainActivity.this.finish();
        	}
		}, 2000);
	}

	
}
