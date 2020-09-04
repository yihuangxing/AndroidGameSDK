package guangyu.sdk.lib.ui.resetpwd;

import android.content.Context;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.BaseLinearLayout;

/**
 * author : yi.huangxing
 * date   : 2020/9/4/0004  15:33
 * desc   : 重置密码
 */
public class ResetPwdView extends BaseLinearLayout {

    public ResetPwdView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutView() {
        return GYSDKConfig.ORIENTATION ? R.layout.activity_gy_reset_pwd_portrait : R.layout.activity_gy_reset_pwd_landscape;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void setListener() {

    }
}
