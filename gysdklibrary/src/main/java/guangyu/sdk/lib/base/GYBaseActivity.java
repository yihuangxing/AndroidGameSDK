package guangyu.sdk.lib.base;

import android.os.Bundle;

import guangyu.sdk.lib.utils.ToastUitls;

/**
 * author : yi.huangxing
 * date   : 2020/8/14/0014  11:34
 * desc   :
 */
public abstract class GYBaseActivity extends IBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutView() > 0) {
            setContentView(getLayoutView());
        }

        findViewById();
        initView();
        setOnclickListener();

    }

    /**
     *  Toast
     */
    protected  void  BaseToast(final String msg){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ToastUitls.show(mContext,msg);
            }
        });
    }


    protected abstract int getLayoutView();

    protected abstract void findViewById();

    protected abstract void initView();

    protected abstract void setOnclickListener();
}
