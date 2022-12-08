package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class A3Activity extends AppCompatActivity {
    TextView mTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        Log.i("superdroid", "onCreate()");

        // 전달받은 인텐트의 내용을 텍스트뷰에 출력한다.
        String caller = getIntent().getStringExtra("CALLER");

        mTextView = findViewById(R.id.text);
        mTextView.setText(caller);
    }


    public void onClick (View v) {
        // A3 애티비티를 실행할 인텐트 엑스트라에 A3가 실행함을 의미하는 A3 문자열을 같이 전달한다.
        Intent intent = new Intent(this, A3Activity.class);
        intent.putExtra("CALLER", "A3");

        startActivity(intent);
    }
}