package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.sql.DatabaseMetaData;

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

        // 3. 실행될 액티비티에게 전달할 직렬화 객체를 인텐트에 추가함
        SampleData sampleData = new SampleData();
        sampleData.setIntData(123456789);
        sampleData.setStringData("Serializable Object");

        intent.putExtra("SAMPLE_DATA", "sampleData");

        // 4. B앱의 액티비티를 실행한다.
        startActivity(intent);
    }
}