package com.example.mytest3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.mytest3.network.bean.RspData;
import com.example.mytest3.network.callback.HttpCallback;
import com.example.mytest3.network.http.IHttpRequest;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAAAAAAA";

    IHttpRequest iHttpRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iHttpRequest = ((MyApplication)getApplication()).getHttpRequest();

        findViewById(R.id.test_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://v.juhe.cn/historyWeather/citys";
                HashMap<String, Object> params = new HashMap<>();
                params.put("province_id", "2");
                params.put("key", "123");

                iHttpRequest.post(url, params, new HttpCallback<RspData>() {
                    @Override
                    public void onSuccess(RspData result) {
                        Log.d(TAG, "onSuccess: " + result);
                    }

                    @Override
                    public void onFailure(String e) {
                        Log.d(TAG, "onFailure: " + e);
                    }
                });
            }
        });
    }
}