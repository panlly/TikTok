package com.taopao.tiktok.ui.base.delegate.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @Author：淘跑
 * @Date: 2018/9/7 0007 11:54
 * @Use： Activity 代理类,用于框架内部在每个  Activity 的对应生命周期中插入需要的逻辑
 */
public interface ActivityDelegate {
    String LAYOUT_LINEARLAYOUT = "LinearLayout";
    String LAYOUT_FRAMELAYOUT = "FrameLayout";
    String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    String ACTIVITY_DELEGATE = "ACTIVITY_DELEGATE";

    void onCreate(@Nullable Bundle savedInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onSaveInstanceState(@NonNull Bundle outState);

    void onDestroy();
}
