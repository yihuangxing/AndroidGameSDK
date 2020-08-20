package guangyu.sdk.lib.ui.login;

import android.view.KeyEvent;

import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.BaseViewGroup;
import guangyu.sdk.lib.base.GYBaseActivity;
import guangyu.sdk.lib.ui.register.RegisterView;

public class GYLoginActivity extends GYBaseActivity {
    private BaseViewGroup mBaseViewGroup;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_login;
    }

    @Override
    protected void findViewById() {
        mBaseViewGroup = findViewById(R.id.mgygamesdk_group);

        //默认添加账号登录页面
        AccountLoginView accountLoginView = new AccountLoginView(mContext);
        updateView(accountLoginView, mBaseViewGroup.getLayoutContent());
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
                    RegisterView registerView = new RegisterView(mContext);
                    updateView(registerView, mBaseViewGroup.getLayoutContent());
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

