package guangyu.sdk.lib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

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
    void updateView(Context context, View view, ViewGroup layout);

    int getViewNum();

    /**
     * @param layout 回退
     */
    boolean removeTopView(ViewGroup layout);

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
