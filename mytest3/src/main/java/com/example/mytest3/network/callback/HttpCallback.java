package com.example.mytest3.network.callback;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class HttpCallback<T> implements ICallback {
    @Override
    public void onSuccess(String result) {
        Type getType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) getType).getActualTypeArguments();
        Class<?> clz = (Class<?>) params[0];
        T t = (T) new Gson().fromJson(result, clz);
        onSuccess(t);
    }

    @Override
    public void onFailure(String e) { }

    public abstract void onSuccess(T t);
}
