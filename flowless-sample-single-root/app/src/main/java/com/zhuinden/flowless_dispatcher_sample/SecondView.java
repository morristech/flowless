package com.zhuinden.flowless_dispatcher_sample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;
import flow.Bundleable;
import flow.Flow;
import flow.preset.SingleRootDispatcher;

/**
 * Created by Zhuinden on 2016.06.28..
 */
public class SecondView
        extends RelativeLayout
        implements SingleRootDispatcher.ViewLifecycleListener, Bundleable {
    public SecondView(Context context) {
        super(context);
        init();
    }

    public SecondView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SecondView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(21)
    public SecondView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    SecondKey secondKey;

    private void init() {
        if(!isInEditMode()) {
            secondKey = Flow.getKey(this);
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }


    @Override
    public Bundle toBundle() {
        return new Bundle();
    }

    @Override
    public void fromBundle(@Nullable Bundle bundle) {
        if(bundle != null) {
        }
    }

    @Override
    public void onViewRestored() {

    }

    @Override
    public void onViewDestroyed(boolean removedByFlow) {

    }
}
