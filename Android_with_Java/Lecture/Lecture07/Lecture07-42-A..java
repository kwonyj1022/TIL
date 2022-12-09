package com.example.activitydatacom;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    public static final int REQUEST_CODE_PIC_FILE_URL = 1;

    private String mSendPicUrl = "/data/pics";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        // 버튼에 "사진 불러오기 : "와 불러올 폴더 명을 출력한다.
        Button loadPicUrlBtn = findViewById(R.id.load_pic_url_btn);

        String loadUrlStr = "사진 불러오기 : " + mSendPicUrl;
        loadPicUrlBtn.setText(loadUrlStr);
    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.load_pic_url_btn:
                // 1. 사진 불러오기 액티비티를 실행하기 위한 인텐트를 생성한다.
                Intent intent = new Intent();

                // 2. 명시적 인텐트 방식으로 실행될 B 액티비티를 설정한다.
                intent.setClass(this, ActivityB.class);

                // 3. 불러올 사진 폴더 명을 인텐트 엑스트라에 추가한다.
                intent.putExtra("PIC_URL", mSendPicUrl);

                // 4. 사진 불러오기 B 액티비티를 실행한다.
                startActivityForResult(intent, REQUEST_CODE_PIC_FILE_URL);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_PIC_FILE_URL) {
            if (resultCode == RESULT_OK) {
                // 1. B 액티비티로부터 전달받은 사진 파일 경로를 추출한다.
                String picFileUrlStr = data.getStringExtra("RESULT_PIC_FILE_URL");

                // 2. 텍스트뷰에 사진 파일 경로를 출력한다.
                TextView picFileUrlTv = findViewById(R.id.result_pic_file_url);
                picFileUrlTv.setText("선택된 사진 파일 경로 : " + picFileUrlStr);
            }
        }
    }
}