package com.example.mytest1.module;

import com.example.mytest1.obj.HttpObject;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.scopes.ActivityScoped;

@InstallIn(ApplicationComponent.class) // 能注入到 Activity，能注入到 Application
//@InstallIn(ActivityComponent.class) // 能注入到 Activity，不能注入到 Application
@Module
public class HttpModule {
    @Provides
    @Singleton // 配合 @InstallIn(ApplicationComponent.class) ，全局单例
//    @ActivityScoped // 配合 @InstallIn(ActivityComponent.class) ，局部单例
    public HttpObject getHttpObject() {
        return new HttpObject();
    }
}
