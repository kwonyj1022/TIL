package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1. 생명주기 onCreate 함수가 호출되었을 때 로그를 출력해둔다.
        Log.d("superdroid", "onCreate()");

        // 2. 레이아웃을 액티비티에 반영한다.
        setContentView(R.layout.activity_main);
    }
}