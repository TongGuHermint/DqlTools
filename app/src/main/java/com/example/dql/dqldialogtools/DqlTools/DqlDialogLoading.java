package com.example.dql.dqldialogtools.DqlTools;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


import com.example.dql.dqldialogtools.R;
import com.github.ybq.android.spinkit.SpinKitView;

/**
 *
 * @author dql
 * @date 2018/4/26
 *
 */
public class DqlDialogLoading extends Dialog {

    private SpinKitView mLoadingView;
    private TextView mTextView;

    public DqlDialogLoading(Context context, int themeResId) {
        super(context, themeResId);
        initView();
    }

    public DqlDialogLoading(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    public DqlDialogLoading(Context context) {
        super(context);
        initView();
    }

    public DqlDialogLoading(Activity context) {
        super(context);
        initView();
    }

   /* public DqlDialogLoading(Context context, float alpha, int gravity) {
        super(context, alpha, gravity);
        initView(context);
    }*/

    private void initView() {
        View mLoadingDialog = LayoutInflater.from(getContext()).inflate(R.layout.item_dialog_sk, null);
        mLoadingView = (SpinKitView) mLoadingDialog.findViewById(R.id.spin_kit);
        mTextView = (TextView) mLoadingDialog.findViewById(R.id.loadingName);
        setContentView(mLoadingDialog);
    }

    public void setLoadingText(CharSequence charSequence) {
        mTextView.setText(charSequence);
    }

    public void setLoadingColor(int color){
        mLoadingView.setColor(color);
    }


    public void cancel(DqlCancelType code, String str) {
        cancel();
        switch (code) {
            case normal:

                break;
            case error:

                break;
            case success:

                break;
            case info:

                break;
            default:

                break;
        }
    }

    public void cancel(String str) {
        cancel();

    }

    public SpinKitView getLoadingView() {
        return mLoadingView;
    }

    public View getDialogContentView() {
        return mLoadingView;
    }

    public TextView getTextView() {
        return mTextView;
    }

    public enum DqlCancelType {normal, error, success, info}
}
