package guangyu.sdk.lib.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Stack;

/**
 * author : yi.huangxing
 * date   : 2020/8/19/0019  20:20
 * desc   :
 */
public class ViewUtil implements ViewUtilInterface {

    private Stack<View> mViews;

    @Override
    public void addView(View view, ViewGroup layout) {
        layout.addView(view);
    }

    @Override
    public void updateView(Context context, View view, ViewGroup layout, ImageView back) {
        boolean isHas = false;
        if (null == mViews) {
            mViews = new Stack<View>();
        }
        if (mViews.size() > 0) {
            for (int i = 0; i < mViews.size(); i++) {
                if (view == mViews.get(i)) {
                    isHas = true;
                    mViews.get(i).setVisibility(View.VISIBLE);
                } else {
                    mViews.get(i).setVisibility(View.GONE);
                }
            }
        }
        if (null != mViews && mViews.size() > 0) {
            if (null != back) {
                back.setVisibility(View.VISIBLE);
            }
        }

        if (!isHas) {
            layout.addView(view);
            mViews.add(view);
        }
    }

    @Override
    public int getViewNum() {
        return null == mViews ? 0 : mViews.size();
    }

    @Override
    public boolean removeTopView(ViewGroup layout, ImageView back) {
        if (null != mViews) {
            if (mViews.size() > 1) {
                layout.removeView(mViews.get(mViews.size() - 1));
                mViews.remove(mViews.size() - 1);
                mViews.get(mViews.size() - 1).setVisibility(View.VISIBLE);
                if (null != back && mViews.size() == 1) {
                    back.setVisibility(View.GONE);
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void removeView(View view, ViewGroup layout) {
        layout.removeView(view);
        mViews.remove(view);
    }

    @Override
    public void removeAllviews(ViewGroup layout) {
        layout.removeAllViews();
        mViews.clear();
    }
}
