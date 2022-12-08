package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }

    public void onClick (View v) {
        Intent intent = new Intent(this, A3Activity.class);
        // FLAG_ACTIVITY_MULTIPLE_TASK : FLAG_ACTIVITY_NEW_TASK의 보조 플래그 (단독 사용 불가)
        // FLAG_ACTIVITY_NEW_TASK와 FALG_ACTIVITY_MULTIPLE_TASK를 함께 사용하여 액티비티를 실행하면 실행되는 액티비티는 무조건 새로운 태스크 생성
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

        startActivity(intent);
    }
}