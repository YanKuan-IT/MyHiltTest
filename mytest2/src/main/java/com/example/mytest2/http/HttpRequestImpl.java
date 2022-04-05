package com.example.mytest2.http;

import android.util.Log;
import javax.inject.Inject;

public class HttpRequestImpl implements IHttpRequest{
    private static final String TAG = "AAAAAAAAAAAAAAAAAA";

    @Inject
    HttpRequestImpl() {}

    @Override
    public void get() {
        Log.d(TAG, "测试接口注入！");
    }
}
