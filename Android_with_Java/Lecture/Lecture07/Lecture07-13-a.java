package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = new Intent();

        intent.setAction("action.ACTION_IMAGE_VIEW");
        Uri imageUri = Uri.parse("http://www.superdroid.com:80/files/images/test.png?a=0#3");
        intent.setDataAndType(imageUri, "image/png");

        // 액티비티 구동 애니메이션을 막는 인텐트 플래그 설정
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        startActivity(intent);
    }
}