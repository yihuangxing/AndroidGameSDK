package guangyu.sdk.lib;

import android.app.Activity;
import android.content.Intent;

import guangyu.sdk.lib.ui.login.GYLoginActivity;

/**
 * author : yi.huangxing
 * date   : 2020/8/12/0012  15:46
 * desc   :
 */
public class GYSDK {


    public static void autoLogin(Activity activity) {
        if (null != activity) {
            Intent intent = new Intent(activity, GYLoginActivity.class);
            activity.startActivity(intent);
        }
    }


}
