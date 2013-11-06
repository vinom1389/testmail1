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
		
	
	}

	
}
