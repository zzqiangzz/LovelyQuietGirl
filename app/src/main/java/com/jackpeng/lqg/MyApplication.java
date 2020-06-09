package com.jackpeng.lqg;

import android.app.Application;

import com.tencent.bugly.Bugly;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), "83c8cd1434", false);
    }
}
