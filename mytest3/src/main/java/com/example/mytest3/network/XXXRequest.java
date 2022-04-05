package com.example.mytest3.network;

import com.example.mytest3.network.callback.ICallback;
import com.example.mytest3.network.http.IHttpRequest;
import java.util.Map;

public class XXXRequest implements IHttpRequest {
    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        callback.onSuccess("xxx post request success.");
    }

    @Override
    public void get(String url, ICallback callback) {
        callback.onSuccess("xxx get request success.");
    }
}
