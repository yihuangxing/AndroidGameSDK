package guangyu.sdk.lib.ui.resetpwd;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;

/**
 * 忘记密码
 */
public class GYResetPwdActivity extends GYBaseActivity {



    @Override
    protected int getLayoutView() {
        return GYSDKConfig.ORIENTATION ? R.layout.activity_gy_reset_pwd_portrait : R.layout.activity_gy_reset_pwd_landscape;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setOnclickListener() {

    }
}