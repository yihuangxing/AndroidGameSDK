package guangyu.sdk.lib.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import guangyu.sdk.lib.R;


/**
 * author : yi.huangxing
 * date   : 2020/8/20/0020  9:37
 * desc   :
 */
public class BaseViewGroup extends LinearLayout implements View.OnClickListener {
    protected Context mContext;
    protected LayoutInflater mInflater;
    private ImageView mButtonBack;
    private ImageView mButtonClose;
    private RelativeLayout mLayoutContent;

    public RelativeLayout getLayoutContent() {
        return mLayoutContent;
    }

    public BaseViewGroup(Context context) {
        this(context, null);
    }

    public BaseViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        addTitleBar();
    }


    public void addTitleBar() {
        View titleBar = mInflater.inflate(R.layout.activity_gy_view_group, null);
        titleBar.findViewById(R.id.mgygamesdk_content);
        mButtonBack = titleBar.findViewById(R.id.mgygamesdk_btn_back);
        mButtonClose = titleBar.findViewById(R.id.mgygamesdk_btn_close);
        mLayoutContent = titleBar.findViewById(R.id.mgygamesdk_content);
        addListener();
        addView(titleBar);

    }

    public void addListener() {
        mButtonBack.setOnClickListener(this);
        mButtonClose.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.mgygamesdk_btn_close) {
            if (null != mBaseViewGroupListener) {
                mBaseViewGroupListener.onBtnClose();
            }
        } else if (id == R.id.mgygamesdk_btn_back) {
            if (null != mBaseViewGroupListener) {
                mBaseViewGroupListener.onBtnBack();
            }
        }
    }

    private BaseViewGroupListener mBaseViewGroupListener;

    public void setBaseViewGroupListener(BaseViewGroupListener baseViewGroupListener) {
        mBaseViewGroupListener = baseViewGroupListener;
    }

    public ImageView getButtonBack() {
        return mButtonBack;
    }

    public interface BaseViewGroupListener {
        void onBtnBack();

        void onBtnClose();
    }
}
