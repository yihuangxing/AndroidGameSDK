package guangyu.sdk.lib.ui.login;
import android.view.View;
import android.widget.Button;
import guangyu.sdk.lib.GYSDKConfig;
import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.GYBaseActivity;
import guangyu.sdk.lib.CallBackManager;
import guangyu.sdk.lib.notify.GYExitCallBack;

/**
 * 退出游戏
 */
public class GYExitActivity extends GYBaseActivity {
    private Button mgygamesdk_gameout_comfirm;
    private Button mgygamesdk_gameout_cancel;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_exit;
    }

    @Override
    protected void findViewById() {
        mgygamesdk_gameout_cancel = findViewById(R.id.gygamesdk_gameout_cancel);
        mgygamesdk_gameout_comfirm = findViewById(R.id.gygamesdk_gameout_comfirm);

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setOnclickListener() {
        if (null != mgygamesdk_gameout_cancel) {
            mgygamesdk_gameout_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sendExitOnFail();
                }
            });
        }
        if (null != mgygamesdk_gameout_comfirm) {
            mgygamesdk_gameout_comfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    sendExitOnSuccess();
                }
            });
        }
    }


    private void sendExitOnSuccess() {

        GYExitCallBack gyExitCallBack = CallBackManager.getGYExitCallBack();
        if (null != gyExitCallBack) {
            gyExitCallBack.exitOnSuccess(GYSDKConfig.EXIT_SUCCESS_CODE);
            CallBackManager.clear();
            finish();
        }
    }

    private void sendExitOnFail() {
        GYExitCallBack gyExitCallBack = CallBackManager.getGYExitCallBack();
        if (null != gyExitCallBack) {
            gyExitCallBack.exitOnCancel(GYSDKConfig.EXIT_CANCEL_CODE);
            finish();
        }
    }
}