package com.eschewobfuscation.flicktotip;

import gueei.binding.Binder;
import gueei.binding.app.BindingActivity;
import gueei.binding.collections.ArrayListObservable;

import data.Bucket;
import data.MainViewModel;
import android.os.Bundle;
import android.view.View;

public class FlicktotipActivity extends BindingActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Binder.init(getApplication());
		View view = Binder.bindView(this, 
                Binder.inflateView(this, R.layout.main, null, false), new MainViewModel());
		
		setContentView(view);
	}
}