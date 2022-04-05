package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.mytest1.obj.HttpObject;
import javax.inject.Inject;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAA";

    @Inject
    HttpObject httpObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, "onCreate: " + httpObject.hashCode());
    }
}