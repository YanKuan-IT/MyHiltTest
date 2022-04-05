package com.example.myhilttest.network.http;

import com.example.myhilttest.network.callback.ICallback;
import java.util.Map;

public interface IHttpRequest {
    void post(String url, Map<String, Object> params, ICallback callback);
    void get(String url, ICallback callback);
}
