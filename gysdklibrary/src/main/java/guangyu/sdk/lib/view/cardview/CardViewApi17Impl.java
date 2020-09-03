package guangyu.sdk.lib.view.cardview;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;


public class CardViewApi17Impl extends CardViewBaseImpl {

    CardViewApi17Impl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {
            public void drawRoundRect(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
            }
        };
    }
}
