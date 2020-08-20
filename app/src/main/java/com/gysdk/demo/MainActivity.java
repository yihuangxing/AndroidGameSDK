package com.gysdk.demo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import guangyu.sdk.lib.GYSDK;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void autoLogin(View view) {
        GYSDK.autoLogin(this);
    }
}