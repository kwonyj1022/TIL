// UI 작성 방법 1 : XML 파일로 사용자 인터페이스 작성
// xml로 작성하고 자바 이용해서 화면에 띄우기만 하면 됨
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {   // MainActivity는 화면 제어 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 인자는 화면에 올릴 설계도(activity_main.xml)의 id
        // setContentView 함수는 레이아웃 XML의 내용을 파싱하여 뷰들을 생성하고, 뷰에 정의된 속성들을 설정하고, 생성된 뷰들을 상하관계에 맞춰 contentFrameLayout(콘텐트영역)에 배치함
        // setContentView 함수 내에 이러한 처리는 모두 LayoutInflater라는 클래스에 의존
        // LayoutInflater 를 수정하여 직접 인플레이션 과정을 제어할 수도 있음
        // 인플레이선(Inflation) : XML 레이아웃에 정의된 정보를 메모리 상에서 객체로 만드는 객체화 과정 (layout 파일에 있는 뷰들을 객체로 만듦)
    }
    
    
    
}