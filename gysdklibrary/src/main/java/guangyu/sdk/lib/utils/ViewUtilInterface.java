package guangyu.sdk.lib.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * author : yi.huangxing
 * date   : 2020/8/19/0019  20:21
 * desc   :
 */
public interface ViewUtilInterface {


    /**
     * @param view   父容器的子类
     * @param layout 父容器
     */


    void addView(View view, ViewGroup layout);

    /**
     * @param context
     * @param view    父容器的子类
     * @param layout  父容器
     */
    void updateView(Context context, View view, ViewGroup layout, ImageView back);

    int getViewNum();

    /**
     * @param layout 回退
     */
    boolean removeTopView(ViewGroup layout, ImageView back);

    /**
     * @param view   父容器的子类
     * @param layout 父容器
     */
    void removeView(View view, ViewGroup layout);

    /**
     * @param layout 父容器
     */
    void removeAllviews(ViewGroup layout);


}
