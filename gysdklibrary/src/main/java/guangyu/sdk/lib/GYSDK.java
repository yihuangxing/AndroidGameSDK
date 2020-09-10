package guangyu.sdk.lib;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;

import guangyu.sdk.lib.notify.GYExitCallBack;
import guangyu.sdk.lib.notify.GYLoginCallBack;
import guangyu.sdk.lib.notify.GYRealNameCallBack;
import guangyu.sdk.lib.notify.GYUserCenterCallBack;
import guangyu.sdk.lib.ui.login.GYExitActivity;
import guangyu.sdk.lib.ui.login.GYLoginActivity;
import guangyu.sdk.lib.ui.realname.GYRealNameActivity;
import guangyu.sdk.lib.ui.usercenter.GYUserCenterActivity;

/**
 * author : yi.huangxing
 * date   : 2020/8/12/0012  15:46
 * desc   :
 */
public class GYSDK {
    //默认竖屏
    public static boolean ORIENTATION;

    /**
     * @param application 上线文
     * @param appKey
     * @param appSecret
     * @param slug
     * @param orientation 默认false为竖屏
     */
    public static void init(Application application, String appKey, String appSecret, String slug, boolean orientation) {
        GYSDKConfig.APP_KEY = appKey;
        GYSDKConfig.APP_SECRET = appSecret;
        GYSDKConfig.APP_SLUG = slug;
        GYSDK.ORIENTATION = orientation;
        initSomething(application);
    }
    private static void initSomething(Application application) {

    }

    /**
     * 是否打印日志，请在init 之前调用，默认开启打印日志，上线关闭
     */
    public static void setDebug(boolean debug) {
        GYSDKConfig.DEBUG = debug;
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

    public static void realName(Activity activity, GYRealNameCallBack realNameCallBack){
        if (null != activity) {
            Intent intent = new Intent(activity, GYRealNameActivity.class);
            CallBackManager.setGYRealNameCallBack(realNameCallBack);
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
