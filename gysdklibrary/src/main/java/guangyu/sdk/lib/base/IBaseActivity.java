package guangyu.sdk.lib.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;

import guangyu.sdk.lib.utils.ViewUtil;

/**
 * author : yi.huangxing
 * date   : 2020/8/19/0019  20:30
 * desc   :
 */
public class IBaseActivity extends Activity {
    protected ViewUtil mViewUtil;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        if (null == mViewUtil) {
            mViewUtil = new ViewUtil();
        }
    }


    protected void updateView(View view, ViewGroup layout, ImageView back) {
        if (null != mContext && null != mViewUtil) {
            mViewUtil.updateView(mContext, view, layout,back);
        }
    }

    protected boolean removeTopView(ViewGroup layout,ImageView back) {
        if (null != mContext && null != mViewUtil) {
            return mViewUtil.removeTopView(layout,back);
        }
        return false;
    }


    /***
     * 设置 app 不随着系统字体的调整而变化
     */

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (newConfig.fontScale != 1) {
            //非默认值
            getResources();
        }

        super.onConfigurationChanged(newConfig);
    }

    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        if (res.getConfiguration().fontScale != 1) {//非默认值
            Configuration newConfig = new Configuration();
            newConfig.setToDefaults();//设置默认
            res.updateConfiguration(newConfig, res.getDisplayMetrics());
        }
        return res;
    }

    //点击空白处收起键盘
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (getCurrentFocus() != null && getCurrentFocus().getWindowToken() != null && imm != null) {
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
        return true;
    }


}
