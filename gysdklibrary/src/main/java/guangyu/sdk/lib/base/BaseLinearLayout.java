package guangyu.sdk.lib.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import guangyu.sdk.lib.utils.ToastUitls;

/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  11:21
 * desc   :
 */
public abstract class BaseLinearLayout extends LinearLayout {
    protected LayoutInflater mInflater;
    protected  Context mContext;

    public BaseLinearLayout(Context context) {
        this(context, null);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext =context;
        mInflater = LayoutInflater.from(context);
        if (getLayoutView()>0){
            addView(mInflater.inflate(getLayoutView(), null));
        }
        findViewById();

        setListener();
    }

    protected abstract int getLayoutView();


    protected abstract void findViewById();


    protected abstract  void setListener();


    /**
     *  Toast
     */
    protected  void  BastToast(String msg){
        if (null!=mContext){
            ToastUitls.show(mContext,msg);
        }
    }
}
