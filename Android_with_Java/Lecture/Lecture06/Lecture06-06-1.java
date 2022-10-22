package com.example.lecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 클릭 인터페이스를 액티비티가 View.OnClickListener를 상속받아 구현
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    // 클릭 인터페이스 핸들러 함수 구현
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_view:
                // 버튼이 클릭되었을 때 토스트 팝업을 이용해 화면에 알림
                Toast.makeText(this, "OnClick Event!", Toast.LENGTH_LONG).show();
                break;
        }
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = (Button) findViewById(R.id.button_view);
        
        // 버튼에 클릭 리스너 객체를 생성 및 설정
        button.setOnClickListener(this);

    }
}
