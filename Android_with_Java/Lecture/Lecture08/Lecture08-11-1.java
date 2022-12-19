package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mCount = 0;
    TextView mCountTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 생명주기 onCreate 함수가 호출되었을 때 로그를 출력해둔다.
        Log.i("superdroid", "onCreate()");

        // 2. 레이아웃을 액티비티에 반영 및 텍스트뷰 객체를 얻어온다.
        mCountTextView = findViewById(R.id.count_textview);

        // 3. 10초동안 1씩 카운트하는 스레드 생성 및 시작
        Thread countThread = new Thread("Count Thread") {   // "Count Thread"는 스레드 이름
            public void run() {
                for (int i = 0; i < 10; i++) {
                    // 카운트 스레드가 1초간 쉬면서 1씩 증가시킨다.
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                    mCount++;
                    
                    // 텍스트뷰에 증가되는 수치를 출력하는 Runnable 객체 메시지를 큐에 추가한다.
                    mCountTextView.post(new Runnable() {
                        @Override
                        public void run() {
                            mCountTextView.setText("Count : " + mCount);
                        }
                    });
                }
            }
        };

        countThread.start();
    }

    public void onClick(View v) {
        // 현재까지 카운트된 수를 텍스트뷰에 출력
        mCountTextView.setText("Count : " + mCount);
    }
}