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

    /* Handler 객체의 handleMessage() 호출 예제 */

    int mCount = 0;
    TextView mCountTextView = null;

    static final private int MESSAGE_DRAW_CURRENT_COUNT = 1;

    Handler mHandler = new Handler() {

        // 메시지 큐는 핸들러에 존재하는 handleMessage 함수를 호출해준다.
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_DRAW_CURRENT_COUNT: {
                    int currentCount = msg.arg1;
                    TextView countTextView = (TextView) msg.obj;

                    countTextView.setText("Count : " + currentCount);
                    break;
                }
                // 다른 케이스들 여러개 만들면 이 핸들러로 여러가지 일을 수행할 수 있음 (템플릿처럼 사용 가능)
            }
        }
    };

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

                    // 메시지 큐에 담을 메시지 하나를 생성한다.
                    Message message = Message.obtain(mHandler);

                    // 핸들러의 handleMessage로 전달한 값들을 설정한다.
                    message.what = MESSAGE_DRAW_CURRENT_COUNT;
                    message.arg1 = mCount;
                    message.obj = mCountTextView;

                    /* 메시지 스케줄링 */
                    // 핸들러를 통해 메시지를 메시지 큐에 보낸다.
                    // 메시지는 10초 지연이 설정되었다.
                    mHandler.sendMessageDelayed(message, 10000);    // 메시지를 10초 후에 메시지큐에 넣음

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

    public void onClick(View v) {
        // 현재까지 카운트된 수를 텍스트뷰에 출력
        mCountTextView.setText("Count : " + mCount);
    }
}