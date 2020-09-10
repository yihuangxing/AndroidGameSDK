package com.gysdk.demo;


import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import guangyu.sdk.lib.GYSDK;
import guangyu.sdk.lib.notify.GYExitCallBack;
import guangyu.sdk.lib.notify.GYLoginCallBack;
import guangyu.sdk.lib.notify.GYRealNameCallBack;
import guangyu.sdk.lib.notify.GYUserCenterCallBack;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImmersionBar.with(this);
        setContentView(R.layout.activity_main);
        //
        if (GYSDK.ORIENTATION) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }


    public void autoLogin(View view) {
        GYSDK.autoLogin(this, new GYLoginCallBack() {
            @Override
            public void loginOnSuccess(String response) {

            }

            @Override
            public void loginOnFail(String fail) {

            }
        });
    }

    public void screenSwitch(View view) {
    }


    public void userCenter(View view) {
        GYSDK.userCenter(this, new GYUserCenterCallBack() {
            @Override
            public void userCenterOnSuccess(String response) {
                Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void userCenterOnFail(String fail) {

            }
        });
    }

    public void realName(View view){
        GYSDK.realName(this, new GYRealNameCallBack() {
            @Override
            public void realNameOnSuccess(String response) {

            }

            @Override
            public void realNameOnFail(String fail) {

            }
        });
    }

    public void onExitSDK(View view) {
        GYSDK.exitSDK(this, new GYExitCallBack() {
            @Override
            public void exitOnSuccess(String response) {
                finish();
                System.exit(0);
            }

            @Override
            public void exitOnCancel(String cancel) {
                Toast.makeText(MainActivity.this, cancel, Toast.LENGTH_SHORT).show();
            }
        });
    }

}