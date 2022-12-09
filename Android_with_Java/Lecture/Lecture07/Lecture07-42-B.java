package com.example.activitydatacom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private String mResultPicFileUrl = "/data/pics/a.png";

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

        // 4. 버튼에 "선택된 사진 경로 전달 : "과 선택된 사진 경로를 출력한다.
        Button resultPicFileUrlBtn = findViewById(R.id.send_pic_file_url_btn);
        String picFileUrlStr = "선택된 사진 경로 전달 \n" + mResultPicFileUrl;
        resultPicFileUrlBtn.setText(picFileUrlStr);
    }

    public void onClick (View v) {
        // 선택된 사진 파일 경로를 전달할 인텐트 생성 및 엑스트라를 설정한다.
        Intent intent = new Intent();
        intent.putExtra("RESULT_PIC_FILE_URL", mResultPicFileUrl);

        // 전달할 인텐트를 설정하고 액티비티를 종료한다.
        setResult(RESULT_OK, intent);
        finish();
    }
}