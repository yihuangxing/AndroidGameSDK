package guangyu.sdk.lib.ui.usercenter;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;

/**
 * 个人中心
 */
public class GYUserCenterActivity extends GYBaseActivity {


    @Override
    protected int getLayoutView() {
        return GYSDKConfig.ORIENTATION ? R.layout.activity_gy_user_center_portrait : R.layout.activity_gy_user_center_landscape;
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