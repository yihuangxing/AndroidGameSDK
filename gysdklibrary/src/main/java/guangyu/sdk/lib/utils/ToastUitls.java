package guangyu.sdk.lib.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import guangyu.sdk.lib.view.cardview.CardView;

/**
 * author : yi.huangxing
 * date   : 2020/9/9/0009  15:50
 * desc   :
 */
public class ToastUitls {

    private static Toast toast;
    private static CardView cardView;
    private static LinearLayout linearLayout;
    private static TextView textView;

    private static Toast initToast(Context context, CharSequence message) {
        if (toast == null) {
            toast = new Toast(context.getApplicationContext());
        }
        linearLayout = new LinearLayout(context.getApplicationContext());
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        cardView = new CardView(context.getApplicationContext());
        textView = new TextView(context.getApplicationContext());
        textView.setPadding(DensityUtils.dip2px(context, 12), DensityUtils.dip2px(context, 12), DensityUtils.dip2px(context, 12), DensityUtils.dip2px(context, 12));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setBackgroundColor(Color.parseColor("#5D5E5D"));
        CardView.LayoutParams layoutParams = new CardView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cardView.addView(textView, layoutParams);
        linearLayout.addView(cardView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(message);
        //设置文字
        toast.setView(linearLayout);
        toast.setGravity(Gravity.CENTER, 0, 0);
        //设置存续期间
        toast.setDuration(Toast.LENGTH_SHORT);
        return toast;

    }


    public static void show(final Context context, final CharSequence message) {
        if (null!=context){
            initToast(context, message).show();
        }

    }
}
