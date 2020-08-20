package guangyu.sdk.lib.ui.login;


import android.content.Context;

import com.gysdk.common.R;

import guangyu.sdk.lib.base.BaseLinearLayout;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  10:17
 * desc   :
 */
public class AccountLoginView extends BaseLinearLayout {

    public AccountLoginView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_account_login;
    }
}
