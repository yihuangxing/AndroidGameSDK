package guangyu.sdk.lib.ui.register;

import android.content.Context;

import com.gysdk.common.R;

import guangyu.sdk.lib.base.BaseLinearLayout;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  11:31
 * desc   :
 */
public class RegisterView extends BaseLinearLayout {
    public RegisterView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_register;
    }
}
