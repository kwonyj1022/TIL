package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
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

        // 2. 외부 음악 재생기 실행 의도 설정
            // 어떤 데이터를 보여달라는 액션
        intent.setAction(Intent.ACTION_VIEW);
            // 다음 위치의 데이터를 보여달라는 의미
        String audioPath = "file:///" + Environment.getExternalStorageDirectory() + "/sample_mp3.mp3";
            // 모든 오디오 포맷의 데이터 타입
        intent.setDataAndType(Uri.parse(audioPath), "audio/*");

        // 3. 외부 컴포넌트를 실행한다.
        startActivity(intent);
    }
}