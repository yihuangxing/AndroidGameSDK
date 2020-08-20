package guangyu.sdk.lib.ui.login;


import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.BaseLinearLayout;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  10:17
 * desc   :
 */
public class AccountLoginView extends BaseLinearLayout implements View.OnClickListener {
    private Button mBtnLogin;
    private Button mBtnRegister;
    private TextView mTvForgetPwd;

    public AccountLoginView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_account_login;
    }

    @Override
    protected void findViewById() {
        mBtnLogin = findViewById(R.id.mgygamesdk_btn_account_login);
        mBtnRegister = findViewById(R.id.mgygamesdk_btn_account_register);
        mTvForgetPwd = findViewById(R.id.mgygamesdk_forgetpwd);
    }

    @Override
    protected void setListener() {
        mBtnLogin.setOnClickListener(this);
        mBtnRegister.setOnClickListener(this);
        mTvForgetPwd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.mgygamesdk_btn_account_login) {
            if (null != mBtnLogin && null != mAccountLoginListener) {
                mAccountLoginListener.onBtnLogin();
            }
        } else if (id == R.id.mgygamesdk_btn_account_register) {
            if (null != mBtnRegister && null != mAccountLoginListener) {
                mAccountLoginListener.onBtnRegister();
            }
        } else if (id == R.id.mgygamesdk_forgetpwd) {
            if (null != mTvForgetPwd && null != mAccountLoginListener) {
                mAccountLoginListener.onBtnForgetPwd();
            }
        }
    }


    public void setAccountLoginListener(AccountLoginListener accountLoginListener) {
        mAccountLoginListener = accountLoginListener;
    }

    private AccountLoginListener mAccountLoginListener;

    public interface AccountLoginListener {
        void onBtnLogin();

        void onBtnRegister();

        void onBtnForgetPwd();
    }
}
