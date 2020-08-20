package guangyu.sdk.lib.base;

import android.os.Bundle;

/**
 * author : yi.huangxing
 * date   : 2020/8/14/0014  11:34
 * desc   :
 */
public abstract class GYBaseActivity extends IBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        findViewById();
        setOnclickListener();

    }

    protected abstract int getLayoutView();

    protected abstract void findViewById();

    protected abstract void setOnclickListener();
}
