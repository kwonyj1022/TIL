package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 메시지에 할 일을 담는 두 가지 방법
     * - Runnable 객체의 run() 실행
     * - Handler 객체의 handleMessage() 호출
     */
    
    /* Runnable 객체의 run() 실행 예제 */

    int mCount = 0;
    TextView mCountTextView = null;

    Handler mHandler = new Handler();

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
                    mCount++;

                    // 실행코드가 담긴 Runnale 객체를 하나 생성한다.
                    Runnable callback = new Runnable() {
                        @Override
                        public void run() {
                            Log.i("superdroid", "Count : " + mCount);
                            mCountTextView.setText("Count : " + mCount);
                        }
                    };

                    // 메시지 큐에 담을 메시지 하나를 생성한다. 생성시 Runnable 객체를 생성자로 전달한다.
                    Message message = Message.obtain(mHandler, callback);

                    // 핸들러를 통해 메시지를 메시지 큐에 보낸다.
                    mHandler.sendMessage(message);

                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        countThread.start();
    }
}