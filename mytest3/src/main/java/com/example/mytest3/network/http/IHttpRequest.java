package com.example.mytest3.network.http;

import com.example.mytest3.network.callback.ICallback;

import java.util.Map;

public interface IHttpRequest {
    void post(String url, Map<String, Object> params, ICallback callback);
    void get(String url, ICallback callback);
}
