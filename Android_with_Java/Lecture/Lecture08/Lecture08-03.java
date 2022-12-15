package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        try {
            for (int i = 0; i < 100; i++)
                Thread.sleep(100);
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
    }
}