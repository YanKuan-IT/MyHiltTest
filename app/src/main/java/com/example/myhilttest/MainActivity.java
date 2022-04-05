package com.example.myhilttest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.myhilttest.network.bean.RspData;
import com.example.myhilttest.network.callback.HttpCallback;
import com.example.myhilttest.network.help.HttpHelper;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAAAA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://v.juhe.cn/historyWeather/citys";
                HashMap<String, Object> params = new HashMap<>();
                params.put("province_id", "2");
                params.put("key", "123");

                HttpHelper.obtain().post(url, params, new HttpCallback<RspData>() {
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