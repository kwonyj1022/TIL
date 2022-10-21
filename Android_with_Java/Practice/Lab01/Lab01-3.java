package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View 객체 획득
        trueBtn = findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_target);
        falseBtn = findViewById(R.id.btn_visible_false);

        // Button 이벤트 등록
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    // 버튼 이벤트 콜백함수
    @Override
    public void onClick(View view) {
        if (view == trueBtn) {
            // trueBtn이 눌리면 targetTextView를 visible 상태로 변경
            targetTextView.setVisibility(View.VISIBLE);
        }
        else if (view == falseBtn) {
            // falseBtn이 눌리면 targetTextView를 invisible 상태로 변경
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}