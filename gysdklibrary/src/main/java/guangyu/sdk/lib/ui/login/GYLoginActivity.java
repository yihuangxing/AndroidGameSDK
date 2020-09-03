package guangyu.sdk.lib.ui.login;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.KeyEvent;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.BaseViewGroup;
import guangyu.sdk.lib.base.GYBaseActivity;
import guangyu.sdk.lib.ui.forgetpwd.GYForgetPwdActivity;
import guangyu.sdk.lib.ui.register.RegisterView;

public class GYLoginActivity extends GYBaseActivity {
    private BaseViewGroup mBaseViewGroup;
    private AccountLoginView mAccountLoginView;
    private RegisterView mRegisterView;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_login;
    }

    @Override
    protected void findViewById() {
        mBaseViewGroup = findViewById(R.id.mgygamesdk_group);


    }

    @Override
    protected void initView() {
        mRegisterView = new RegisterView(mContext);
        //默认添加账号登录页面
        mAccountLoginView = new AccountLoginView(mContext);
        updateView(mAccountLoginView, mBaseViewGroup.getLayoutContent());
    }


    @Override
    protected void setOnclickListener() {
        if (null != mBaseViewGroup) {
            mBaseViewGroup.setBaseViewGroupListener(new BaseViewGroup.BaseViewGroupListener() {
                @Override
                public void onBtnBack() {
                    removeTopView(mBaseViewGroup.getLayoutContent());
                }

                @Override
                public void onBtnClose() {
                    finish();
                }
            });
        }
        if (null != mAccountLoginView) {
            mAccountLoginView.setAccountLoginListener(new AccountLoginView.AccountLoginListener() {
                @Override
                public void onBtnLogin() {

                }

                @Override
                public void onBtnRegister() {
                    updateView(mRegisterView, mBaseViewGroup.getLayoutContent());
                }

                @Override
                public void onBtnForgetPwd() {
                    Intent intent = new Intent(mContext, GYForgetPwdActivity.class);
                    startActivity(intent);
                }
            });

        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean isTopview = removeTopView(mBaseViewGroup.getLayoutContent());
        if (!isTopview) {
            finish();
        }
        return true;

    }
}

