package com.gysdk.demo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import guangyu.sdk.lib.GYSDK;
import guangyu.sdk.lib.ui.forgetpwd.GYForgetPwdActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ImmersionBar.with(this);
        setContentView(R.layout.activity_main);
    }

    public void autoLogin(View view) {
        GYSDK.autoLogin(this);
    }

    public void screenSwitch(View view) {
//        GYSDKConfig.ORIENTATION = !GYSDKConfig.ORIENTATION;
//        setRequestedOrientation(GYSDKConfig.ORIENTATION ? ActivityInfo.SCREEN_ORIENTATION_PORTRAIT : ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Intent intent =new Intent(MainActivity.this, GYForgetPwdActivity.class);
        startActivity(intent);
    }
}