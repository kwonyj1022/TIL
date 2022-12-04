package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        // 2. 외부 이메일 컴포넌트를 요청한다.
            // 단말기에 설치된 앱을 실행했을 때 가장 첫 번째로 실행되는 액티비티를 보여달라는 액션
        intent.setAction(Intent.ACTION_MAIN);
            // 안드로이드 기본 앱 중 이메일 카테고리
        intent.addCategory(Intent.CATEGORY_APP_EMAIL);

        // 3. 외부 컴포넌트를 실행한다.
        startActivity(intent);
    }
}