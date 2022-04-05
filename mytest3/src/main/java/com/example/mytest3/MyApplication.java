package com.example.mytest3;

import android.app.Application;
import com.example.mytest3.annotation.BindOkHttp;
import com.example.mytest3.annotation.BindXXXRequest;
import com.example.mytest3.network.http.IHttpRequest;
import javax.inject.Inject;
import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApplication extends Application {

    @BindOkHttp
//    @BindXXXRequest
    @Inject
    IHttpRequest iHttpRequest;

    public IHttpRequest getHttpRequest() {
        return iHttpRequest;
    }
}
