package com.gysdk.demo;

import android.app.Application;

import guangyu.sdk.lib.GYSDK;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  18:44
 * desc   :
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new GYSDK.Builder(this, false)
                .setDebug(true)
                .setAppKey("111111")
                .setSlug("android")
                .build();
    }
}
