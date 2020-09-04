package com.gysdk.demo;


import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import guangyu.sdk.lib.GYSDK;
import guangyu.sdk.lib.GYSDKConfig;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImmersionBar.with(this);
        setContentView(R.layout.activity_main);
        //
        if (GYSDKConfig.ORIENTATION) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }


    public void autoLogin(View view) {
        GYSDK.autoLogin(this);
    }

    public void screenSwitch(View view) {
    }


    public void userCenter(View view) {
        GYSDK.userCenter(this);
    }

}