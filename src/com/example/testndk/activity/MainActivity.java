package com.example.testndk.activity;

import com.example.testndk.jni.JniClient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

	static {
		System.loadLibrary("TestNdk");
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        
        String str = JniClient.AddStr("test", "test");
        
        TextView tv = new TextView(this);
        tv.setText(str);
        setContentView(tv);
    }
}
