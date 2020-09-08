package guangyu.sdk.lib.notify;

/**
 * author : yi.huangxing
 * date   : 2020/9/8/0008  14:49
 * desc   :
 */
public interface GYLoginCallBack {

    void loginOnSuccess(String response);

    void loginOnFail(String fail);
}
