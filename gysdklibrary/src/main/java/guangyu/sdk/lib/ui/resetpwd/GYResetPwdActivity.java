package guangyu.sdk.lib.ui.resetpwd;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import guangyu.sdk.lib.GYSDK;
import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;

/**
 * 忘记密码
 */
public class GYResetPwdActivity extends GYBaseActivity {
    LinearLayout mgygamesdk_navitation_back_game;


    @Override
    protected int getLayoutView() {
        return GYSDK.ORIENTATION ? R.layout.activity_gy_reset_pwd_portrait : R.layout.activity_gy_reset_pwd_landscape;
    }

    @Override
    protected void findViewById() {
        mgygamesdk_navitation_back_game = findViewById(R.id.gygamesdk_navitation_back_game);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setOnclickListener() {
        if (null != mgygamesdk_navitation_back_game) {
            mgygamesdk_navitation_back_game.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }
    }
}