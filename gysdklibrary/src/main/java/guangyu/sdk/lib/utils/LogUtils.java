package guangyu.sdk.lib.utils;

import android.util.Log;

import guangyu.sdk.lib.GYSDKConfig;

/**
 * author : yi.huangxing
 * date   : 2020/9/8/0008  15:20
 * desc   :
 */
public class LogUtils {
    static String className;//类名
    static String methodName;//方法名
    static int lineNumber;//行数

    /**
     * 判断是否可以调试
     *
     * @return
     */
    public static boolean isDebuggable() {
        return !GYSDKConfig.DEBUG;
    }

    private static String createLog(String log) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("2144================");
        buffer.append(methodName);
        buffer.append("(").append(className).append(":").append(lineNumber).append(")================");
        buffer.append(log);
        return buffer.toString();
    }

    /**
     * 获取文件名、方法名、所在行数
     *
     * @param sElements
     */
    private static void getMethodNames(StackTraceElement[] sElements) {
        className = sElements[1].getFileName();
        methodName = sElements[1].getMethodName();
        lineNumber = sElements[1].getLineNumber();
    }


    public static void e(String message) {
        if (!isDebuggable()) {
            return;
        }
        getMethodNames(new Throwable().getStackTrace());
        Log.e(className, createLog(message));
    }

    public static void i(String message) {
        if (!isDebuggable()) {
            return;
        }
        getMethodNames(new Throwable().getStackTrace());
        Log.i(className, createLog(message));
    }

    public static void d(String message) {
        if (!isDebuggable()) {
            return;
        }
        getMethodNames(new Throwable().getStackTrace());
        Log.d(className, createLog(message));
    }

    public static void v(String message) {
        if (!isDebuggable()) {
            return;
        }
        getMethodNames(new Throwable().getStackTrace());
        Log.v(className, createLog(message));
    }

    public static void w(String message) {
        if (!isDebuggable()) {
            return;
        }
        getMethodNames(new Throwable().getStackTrace());
        Log.w(className, createLog(message));
    }

    public static void print(boolean release) {
        Log.e("2144", "================================================================");
        Log.e("2144", "|| 2144 SDK init 初始化");
        Log.e("2144", "|| 2144 SDK Version： V 1.0.0");
        if (!release) {
            Log.e("2144", "|| 2144 警告 SDK 为debug模式，上线前请将release设置为true");
        } else {
            Log.e("2144", "|| 2144 SDK 为release模式");
        }
        Log.e("2144", "================================================================");

    }
}
