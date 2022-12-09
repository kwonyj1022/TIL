package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }

    public void onClick (View v) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "com.example.taskb",
                "com.example.taskb.B1Activity");
        intent.setComponent(componentName);
        intent.addFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME);
        startActivity(intent);
    }
}