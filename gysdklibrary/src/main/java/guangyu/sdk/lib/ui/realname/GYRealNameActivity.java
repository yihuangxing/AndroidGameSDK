package guangyu.sdk.lib.ui.realname;

import guangyu.sdk.lib.R;
import guangyu.sdk.lib.base.BaseViewGroup;
import guangyu.sdk.lib.base.GYBaseActivity;

/**
 * 实名认证
 */

public class GYRealNameActivity extends GYBaseActivity {
    private BaseViewGroup mBaseViewGroup;
    private GYActivateView mGYActivateView;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_gy_real_name;
    }

    @Override
    protected void findViewById() {
        mBaseViewGroup =findViewById(R.id.gygamesdk_group);
        mGYActivateView =new GYActivateView(mContext);

    }

    @Override
    protected void initView() {
        if (null!=mBaseViewGroup){
            updateView(mGYActivateView,mBaseViewGroup.getLayoutContent(),null);
        }
    }

    @Override
    protected void setOnclickListener() {
         if (null!=mBaseViewGroup){
             mBaseViewGroup.setBaseViewGroupListener(new BaseViewGroup.BaseViewGroupListener() {
                 @Override
                 public void onBtnBack() {

                 }

                 @Override
                 public void onBtnClose() {
                     finish();
                 }
             });
         }
    }
}