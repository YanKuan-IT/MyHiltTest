package com.example.myhilttest.network.help;

import com.example.myhilttest.network.callback.ICallback;
import com.example.myhilttest.network.http.IHttpRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class HttpHelper implements IHttpRequest {
    private static HttpHelper instance;

    public static HttpHelper obtain() {
        synchronized (HttpHelper.class) {
            if (instance == null) {
                instance = new HttpHelper();
            }
        }
        return instance;
    }

    private HttpHelper(){}

    private static IHttpRequest mIHttpRequest = null;

    public static void init(IHttpRequest iHttpRequest) {
        mIHttpRequest = iHttpRequest;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        String finalUrl = appendParams(url, params);
        mIHttpRequest.post(finalUrl, params, callback);
    }

    @Override
    public void get(String url, ICallback callback) {
        mIHttpRequest.get(url, callback);
    }

    public static String appendParams(String url, Map<String, Object> params) {
        if (params == null || params.isEmpty()) {
            return url;
        }
        StringBuilder urlBuilder = new StringBuilder(url);
        if (urlBuilder.indexOf("?") <= 0) {
            urlBuilder.append("?");
        } else {
            if (!urlBuilder.toString().endsWith("?")) {
                urlBuilder.append("&");
            }
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            urlBuilder.append("&" + entry.getKey())
                    .append("=")
                    .append(encode(entry.getValue().toString()));
        }
        return urlBuilder.toString();
    }

    private static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
