package com.example.basicjavalifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lifecycle event :", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle event :", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle event :", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle event :", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle event :", "onDestroy");
    }
}
