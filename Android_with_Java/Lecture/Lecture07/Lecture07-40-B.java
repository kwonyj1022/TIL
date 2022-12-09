package com.example.activitydatacom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        // 1. A 액티비티로부터 전다 받은 인텐트를 참조한다.
        Intent intent = getIntent();

        // 2. 인텐트에 포함된 엑스트라에서 사진 폴더명을 추출한다.
        Bundle bundle = intent.getExtras();
        String picUrl = bundle.getString("PIC_URL");

        // 3. 텍스트뷰에 "전달 받은 사진 폴더 : "와 불러올 폴더 명을 출력한다.
        TextView loadPicUrlTextView = findViewById(R.id.received_pic_folder_url);
        String picUrlStr = "전달 받은 사진 폴더 : " + picUrl;
        loadPicUrlTextView.setText(picUrlStr);
    }
}