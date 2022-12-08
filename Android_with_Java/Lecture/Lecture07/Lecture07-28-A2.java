package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }

    public void onClick (View v) {
        Intent intent = new Intent(this, A3Activity.class);
        intent.putExtra("CALLER", "A2");

        startActivity(intent);
    }
}