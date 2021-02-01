package com.jackpeng.lqg;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.Bugly;

public class MyApplication extends Application {
    private final String TAG = MyApplication.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"init finish");
        Bugly.init(getApplicationContext(), "83c8cd1434", true);
    }
}
