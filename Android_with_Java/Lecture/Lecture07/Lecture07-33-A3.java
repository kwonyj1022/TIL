package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

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
        Intent intent = new Intent(this, A2Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);    // 보통 FLAG_ACTIVITY_SINGLE_TOP과 같이 사용
        startActivity(intent);
    }
}