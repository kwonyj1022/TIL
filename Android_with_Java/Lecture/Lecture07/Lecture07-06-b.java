package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 자신을 호출한 액티비티가 보낸 인텐트의 번들 객체 추출
        Intent intent = getIntent();
        Bundle bundleData = intent.getBundleExtra("SAMPLE_DATA");

        if (bundleData == null) {
            Toast.makeText( this, "SampleData null!", Toast.LENGTH_LONG).show();
            return;
        }

        // 2. 전달 받은 직렬화 객체 내용을 출력해 본다.
        TextView receivedStr = findViewById(R.id.intent_received_data);
        receivedStr.setText("Bundle String : " + "\n" + "Bundle Integer : " + bundleData.getInt("INT_DATA"));
    }
}