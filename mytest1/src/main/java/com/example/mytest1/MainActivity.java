package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.mytest1.obj.HttpObject;
import javax.inject.Inject;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint // 被注入的
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAA";

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + httpObject.hashCode());
        Log.d(TAG, "onCreate: " + httpObject2.hashCode());

        findViewById(R.id.test_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}