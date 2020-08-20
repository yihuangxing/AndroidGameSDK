package guangyu.sdk.lib.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

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


    protected void updateView(View view, ViewGroup layout) {
        if (null != mContext && null != mViewUtil) {
            mViewUtil.updateView(mContext, view, layout);
        }
    }

    protected boolean removeTopView(ViewGroup layout) {
        if (null != mContext && null != mViewUtil) {
            return mViewUtil.removeTopView(layout);
        }
        return false;
    }


}
