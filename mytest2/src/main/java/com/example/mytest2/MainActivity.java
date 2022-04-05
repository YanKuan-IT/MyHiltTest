package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mytest2.http.IHttpRequest;
import javax.inject.Inject;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    IHttpRequest httpRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        httpRequest.get();
    }
}