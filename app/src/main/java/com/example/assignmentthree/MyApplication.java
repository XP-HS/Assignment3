package com.example.assignmentthree;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        // 基础应用初始化
        Log.d(TAG, "应用程序启动");

        // 可以在这里添加基础的全局配置
        // 例如：初始化Volley请求队列、配置Glide等

        Log.d(TAG, "应用初始化完成");
    }
}