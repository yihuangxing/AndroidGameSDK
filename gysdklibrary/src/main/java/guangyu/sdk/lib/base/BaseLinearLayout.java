package guangyu.sdk.lib.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  11:21
 * desc   :
 */
public abstract class BaseLinearLayout extends LinearLayout {
    protected LayoutInflater mInflater;

    public BaseLinearLayout(Context context) {
        this(context, null);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        addView(mInflater.inflate(getLayoutView(), null));
    }

    protected abstract int getLayoutView();
}
