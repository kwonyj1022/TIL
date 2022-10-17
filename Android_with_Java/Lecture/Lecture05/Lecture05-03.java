// UI 작성 방법 3 : XML과 자바 코드를 동시에 사용해서 사용자 인터페이스 작성
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {   // MainActivity는 화면 제어 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.button1);
        b1.setText("코드에서도 변경 가능");

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setEnabled(false);
    }
}