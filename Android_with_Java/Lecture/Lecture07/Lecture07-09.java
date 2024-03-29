package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        // 1. 인텐트를 하나 생성한다.
        Intent intent = new Intent();

        // 2. 외부 웹브라우저 실행 의도 설정
            // 어떤 데이터를 보여달라는 액션
        intent.setAction(Intent.ACTION_VIEW);
            // 다음 위치의 어떤 데이터를 보여달라는 의미
        intent.setData(Uri.parse("http://m.naver.com"));

        // 3. 외부 컴포넌트를 실행한다.
        startActivity(intent);
    }
}