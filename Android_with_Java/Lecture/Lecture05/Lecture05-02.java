// UI 작성 방법 2 : 자바 코드로 사용자 인터페이스 작성
// Lecture05-01.xml 과 똑같은 레이아웃을 자바 코드로 작성하기
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ContentFrameLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {   // MainActivity는 화면 제어 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. 전체 뷰를 감싸고 있는 수직 배치 LinearLayout을 자바 소스로 옮긴다

        LinearLayout rootLinear = new LinearLayout(this);
        rootLinear.setOrientation(LinearLayout.VERTICAL);

        ContentFrameLayout.LayoutParams rootLp = new ContentFrameLayout.LayoutParams(
                        ContentFrameLayout.LayoutParams.MATCH_PARENT,
                        ContentFrameLayout.LayoutParams.MATCH_PARENT);

        rootLp.setMargins(20, 20, 20, 20);

        // 2. 이름 입력 부분의 레이아웃을 자바 소스로 옮긴다

        // 2-1. 이름 입력 TextView와 EditText를 감싸는 LinearLayout 부분
        LinearLayout nameInputLinear = new LinearLayout(this);
        nameInputLinear.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams nameInputLp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        // 2-2. 이름 입력 부분 LinearLayout의 TextView
        TextView nameTv = new TextView(this);
        nameTv.setText("이름을 입력하세요");
        LinearLayout.LayoutParams nameTextLp = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT);
        nameTextLp.weight = 1;

        // 2-3. 이름 입력 부분 LinearLayout의 EditText
        EditText nameEt = new EditText(this);
        LinearLayout.LayoutParams nameEditLp = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT);
        nameEditLp.weight = 1;

        // 2-4. 각 부분 연결
        nameInputLinear.addView(nameTv, nameTextLp);
        nameInputLinear.addView(nameEt, nameEditLp);
        rootLinear.addView(nameInputLinear, nameInputLp);

        // 3. 저장하기 버튼을 자바 소스로 옮긴다

        // 3-1. 저장하기 버튼
        Button saveBtn = new Button(this);
        saveBtn.setText("저장하기");
        LinearLayout.LayoutParams saveBtnLp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        // 3.2. 연결
        rootLinear.addView(saveBtn, saveBtnLp);

        // 4. 전체 레이아웃을 콘텐트 영역에 추가
        setContentView(rootLinear, rootLp);

    }

}