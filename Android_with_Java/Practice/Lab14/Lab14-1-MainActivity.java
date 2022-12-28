package com.example.threadhandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView startView;
    private ImageView pauseView;
    private TextView textView;

    private boolean loopFlag = true;
    private boolean isFirst = true;
    private boolean isRun;

    private MyThread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startView = findViewById(R.id.main_startBtn);
        pauseView = findViewById(R.id.main_pauseBtn);
        textView = findViewById(R.id.main_textView);

        startView.setOnClickListener(this);
        pauseView.setOnClickListener(this);

        thread = new MyThread();
    }

    private Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                textView.setText(String.valueOf(msg.arg1));
            } else if (msg.what == 2) {
                textView.setText((String) msg.obj);
            }
        }
    };

    @Override
    public void onClick(View v) {
        if (v == startView) {
            if (isFirst) {
                isFirst = false;
                isRun = true;
                thread.start();
            } else {
                isRun = true;
            }
        } else if (v == pauseView) {
            isRun = false;
        }
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            try {
                int count = 10;
                while(loopFlag) {
                    Thread.sleep(1000);
                    if (isRun) {
                        count--;
                        Message message = Message.obtain();
                        message.what = 1;
                        message.arg1 = count;
                        handler.sendMessage(message);
                        loopFlag = false;
                    }
                }
            } catch (Exception e) {}
        }
    }
}