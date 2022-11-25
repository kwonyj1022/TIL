package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 자신을 호출한 액티비티가 보낸 인텐트로부터 데이터 추출
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        // 2. 자신을 호출한 액티비티가 보낸 데이터를 출력한다.
        TextView receivedStr = findViewById(R.id.intent_received_data);
        receivedStr.setText("" + name);
    }
}