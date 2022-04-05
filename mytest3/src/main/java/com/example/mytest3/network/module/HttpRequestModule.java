package com.example.mytest3.network.module;

import com.example.mytest3.annotation.BindOkHttp;
import com.example.mytest3.annotation.BindXXXRequest;
import com.example.mytest3.network.OkHttpRequest;
import com.example.mytest3.network.XXXRequest;
import com.example.mytest3.network.http.IHttpRequest;
import javax.inject.Singleton;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class HttpRequestModule {

    @BindOkHttp
    @Binds
    @Singleton
    public abstract IHttpRequest bindOkHttp(OkHttpRequest okHttpRequest);

    @BindXXXRequest
    @Binds
    @Singleton
    public abstract IHttpRequest bindXXXRequest(XXXRequest xxxRequest);
}
