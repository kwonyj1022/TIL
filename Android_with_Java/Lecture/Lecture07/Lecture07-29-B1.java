package com.example.taskb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class B1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "com.example.task",
                "com.example.task.A2Activity");
        intent.setComponent(componentName);

        startActivity(intent);
    }
}