package guangyu.sdk.lib;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;

import guangyu.sdk.lib.notify.CallBackManager;
import guangyu.sdk.lib.notify.GYExitCallBack;
import guangyu.sdk.lib.notify.GYLoginCallBack;
import guangyu.sdk.lib.notify.GYUserCenterCallBack;
import guangyu.sdk.lib.ui.login.GYExitActivity;
import guangyu.sdk.lib.ui.login.GYLoginActivity;
import guangyu.sdk.lib.ui.usercenter.GYUserCenterActivity;

/**
 * author : yi.huangxing
 * date   : 2020/8/12/0012  15:46
 * desc   :
 */
public class GYSDK {

    private GYSDK(Builder builder) {
        GYSDKConfig.APP_KEY = builder.appKey;
        GYSDKConfig.APP_SLUG = builder.slug;
        GYSDKConfig.ORIENTATION = builder.orientation;
        GYSDKConfig.DEBUG = builder.debug;
    }

    public static class Builder {
        private String appKey;
        private String slug;
        private Application mApplication;
        private boolean orientation;
        private boolean debug;

        //把必参 ，可选参数分开，很重要哦
        public Builder(Application application, boolean orientation) {
            this.mApplication = application;
            this.orientation = orientation;
        }

        public Builder setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder setDebug(boolean debug) {
            this.debug = debug;
            return this;
        }

        public GYSDK build() {
            return new GYSDK(this);
        }
    }


    /**
     * 自动登录
     */
    public static void autoLogin(Activity activity, GYLoginCallBack loginCallBack) {
        if (null != activity) {
            Intent intent = new Intent(activity, GYLoginActivity.class);
            CallBackManager.setGYLoginCallBack(loginCallBack);
            activity.startActivity(intent);
        }
    }

    /**
     * 个人中心
     */
    public static void userCenter(Activity activity, GYUserCenterCallBack userCenterCallBack) {
        if (null != activity) {
            Intent intent = new Intent(activity, GYUserCenterActivity.class);
            CallBackManager.setGYUserCenterCallBack(userCenterCallBack);
            activity.startActivity(intent);
        }
    }

    /**
     * 退出游戏
     */
    public static void exitSDK(Activity activity, GYExitCallBack exitCallBack) {
        if (null != activity) {
            Intent intent = new Intent(activity, GYExitActivity.class);
            CallBackManager.setGYExitCallBack(exitCallBack);
            activity.startActivity(intent);
        }
    }
}
