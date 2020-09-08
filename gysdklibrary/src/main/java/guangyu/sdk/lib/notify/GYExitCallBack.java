package guangyu.sdk.lib.notify;

/**
 * author : yi.huangxing
 * date   : 2020/9/8/0008  15:22
 * desc   :
 */
public interface GYExitCallBack {

    void exitOnSuccess(String response);

    void exitOnCancel(String cancel);
}
