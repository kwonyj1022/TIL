package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 스레드를 생성하는 방법
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                /**
                 * 처리해야 할 일
                 */
            }
        };
        
        thread.start();     // run()을 실행하는 쓰레드가 생성됨
    }
}