// A앱 MainActivity.java 파일
package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
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

        // 2. 인텐트에 실행할 패키지의 액티비티 정보를 설정한다.
        ComponentName componentName = new ComponentName(
                "com.example.b",
                "com.example.b.MainActivity");

        intent.setComponent(componentName);

        // 3. 인텐트에 데이터를 추가한다.
        intent.putExtra("NAME", "Superdroid");

        // 4. B앱의 액티비티를 실행한다.
        startActivity(intent);
    }
}