package guangyu.sdk.lib.ui.usercenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;
import guangyu.sdk.lib.notify.CallBackManager;
import guangyu.sdk.lib.notify.GYUserCenterCallBack;

/**
 * 个人中心
 */
public class GYUserCenterActivity extends GYBaseActivity {
    LinearLayout mgygamesdk_navitation_back_game;
    private ImageView mgygamesdk_navitation_back;

    @Override
    protected int getLayoutView() {
        return GYSDKConfig.ORIENTATION ? R.layout.activity_gy_user_center_portrait : R.layout.activity_gy_user_center_landscape;
    }

    @Override
    protected void findViewById() {
        mgygamesdk_navitation_back_game = findViewById(R.id.gygamesdk_navitation_back_game);
        mgygamesdk_navitation_back = findViewById(R.id.gygamesdk_navitation_back);
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
        if (null != mgygamesdk_navitation_back) {
            mgygamesdk_navitation_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sendOnSuccessCallBack("调用者接收onsuccess回调");
                }
            });
        }
    }


    private void sendOnSuccessCallBack(String msg) {
        GYUserCenterCallBack gyUserCenterCallBack = CallBackManager.getGYUserCenterCallBack();
        if (null != gyUserCenterCallBack) {
            gyUserCenterCallBack.userCenterOnSuccess(msg);
        }
    }


    private void sendOnFailCallBack(String fail) {
        GYUserCenterCallBack gyUserCenterCallBack = CallBackManager.getGYUserCenterCallBack();
        if (null != gyUserCenterCallBack) {
            gyUserCenterCallBack.userCenterOnFail(fail);
        }
    }

}