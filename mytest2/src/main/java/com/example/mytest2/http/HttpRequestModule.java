package com.example.mytest2.http;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class HttpRequestModule {
    @Binds
    public abstract IHttpRequest bindTest(HttpRequestImpl httpRequest);
}
