package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }

    public void onClick (View v) {
        Intent intent = new Intent(this, A2Activity.class);
        // FLAG_ACTIVITY-NEW_TASK : 자신의 태스크 친화력 이름 태스크에서만 실행됨.
        // 기존에 액티비티의 태스크 친화력 이름을 가진 태스크가 존재하지않으면, 태스크 친화력 이름으로 새로운 태스크를 생성하고 그 안에서 액티비티가 실행됨
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}