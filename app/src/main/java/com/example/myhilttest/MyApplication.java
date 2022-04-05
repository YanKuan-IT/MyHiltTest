package com.example.myhilttest;

import android.app.Application;
import com.example.myhilttest.network.OkHttpRequest;
import com.example.myhilttest.network.XXXRequest;
import com.example.myhilttest.network.help.HttpHelper;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        HttpHelper.init(new OkHttpRequest());
//        HttpHelper.init(new XXXRequest());
    }
}
