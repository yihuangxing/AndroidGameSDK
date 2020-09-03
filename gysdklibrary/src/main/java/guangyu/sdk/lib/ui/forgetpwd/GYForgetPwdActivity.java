package guangyu.sdk.lib.ui.forgetpwd;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;

public class GYForgetPwdActivity extends GYBaseActivity {



    @Override
    protected int getLayoutView() {

        return GYSDKConfig.ORIENTATION ? R.layout.activity_gy_forget_pwd_portrait : R.layout.activity_gy_forget_pwd_landscape;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {
//        WindowManager.LayoutParams lp = getWindow().getAttributes();
//        lp.width = DensityUtils.getScreenWidth(this) ; // 屏幕宽度的一半
//        lp.height = DensityUtils.getScreenHeight(this); // 屏幕高度的一半
//        getWindow().setAttributes(lp); // 设置参数给window
    }

    @Override
    protected void setOnclickListener() {

    }
}