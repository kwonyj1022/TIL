package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* 방법 1 */
    public void onClick(View v) {
        Intent intent = new Intent();

        ComponentName componentName = new ComponentName(
                "com.example.a",
                "com.example.a.A2Activity");

        intent.setComponent(componentName);

        startActivity(intent);
    }
}