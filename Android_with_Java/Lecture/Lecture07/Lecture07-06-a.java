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

        // 3. Bundle 객체를 생성 및 데이터를 추가하고 실행을 액티비티에게 전달할 인테트에 추가한다
        Bundle bundleData = new Bundle();
        bundleData.putInt("INT_DATA", 123456789);
        bundleData.putString("STR_DATA", "Bundle string");

        intent.putExtra("SAMPLE_DATA", bundleData);

        // 4. B앱의 액티비티를 실행한다.
        startActivity(intent);
    }
}