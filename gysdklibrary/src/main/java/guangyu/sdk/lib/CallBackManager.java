package guangyu.sdk.lib;

import guangyu.sdk.lib.notify.GYExitCallBack;
import guangyu.sdk.lib.notify.GYLoginCallBack;
import guangyu.sdk.lib.notify.GYRealNameCallBack;
import guangyu.sdk.lib.notify.GYUserCenterCallBack;
import guangyu.sdk.lib.utils.LogUtils;

/**
 * author : yi.huangxing
 * date   : 2020/9/8/0008  14:48
 * desc   : 通讯
 */
public class CallBackManager {
    public static GYLoginCallBack sGYLoginCallBack;
    public static GYUserCenterCallBack sGYUserCenterCallBack;
    public static GYExitCallBack sGYExitCallBack;
    public static GYRealNameCallBack sGYRealNameCallBack;

    public static GYRealNameCallBack getGYRealNameCallBack() {
        return sGYRealNameCallBack;
    }

    public static void setGYRealNameCallBack(GYRealNameCallBack GYRealNameCallBack) {
        sGYRealNameCallBack = GYRealNameCallBack;
    }



    public static GYExitCallBack getGYExitCallBack() {
        return sGYExitCallBack;
    }

    public static void setGYExitCallBack(GYExitCallBack GYExitCallBack) {
        sGYExitCallBack = GYExitCallBack;
    }


    public static GYUserCenterCallBack getGYUserCenterCallBack() {
        return sGYUserCenterCallBack;
    }

    public static void setGYUserCenterCallBack(GYUserCenterCallBack GYUserCenterCallBack) {
        sGYUserCenterCallBack = GYUserCenterCallBack;
    }

    public static GYLoginCallBack getGYLoginCallBack() {
        return sGYLoginCallBack;
    }


    public static void setGYLoginCallBack(GYLoginCallBack GYLoginCallBack) {
        sGYLoginCallBack = GYLoginCallBack;
    }


    public static void clear() {
        if (null != sGYLoginCallBack) {
            sGYLoginCallBack = null;
        }
        if (null != sGYUserCenterCallBack) {
            sGYUserCenterCallBack = null;
        }
        if (null != sGYExitCallBack) {
            sGYExitCallBack = null;
        }
        if (null!=sGYRealNameCallBack){
            sGYRealNameCallBack=null;
        }
        LogUtils.d("call back manager clear success");
    }

}
