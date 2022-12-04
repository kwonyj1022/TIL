package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        // 1. 전달 받은 인텐트에서 데이터를 추출한다.
        Uri imageUri = intent.getData();

        // 2. 데이터 URI의 내용을 문자열로 저장한다.
        StringBuilder temp = new StringBuilder();

        temp.append("Scheme : " + imageUri.getScheme() + "\n");
        temp.append("Host : " + imageUri.getHost() + "\n");
        temp.append("Port : " + imageUri.getPort() + "\n");
        temp.append("Path : " + imageUri.getPath() + "\n");
        temp.append("Query : " + imageUri.getQuery() + "\n");
        temp.append("Fragment : " + imageUri.getFragment() + "\n");
        temp.append("Authority : " + imageUri.getAuthority() + "\n");
        temp.append("Last Path Segment : " + imageUri.getLastPathSegment() + "\n");

        // 3. 텍스트뷰에 데이터 URI 문자열을 출력한다.
        TextView textView = findViewById(R.id.intent_received_data);
        textView.setText(temp);
    }
}