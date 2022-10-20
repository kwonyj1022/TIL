// 터치 이벤트 리스너 구현 방법 3 : 익명의 내부 클래스 구현
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/*
    터치 이벤트 리스너란?
    - 터치가 발생했을 때 터치 이벤트 리스너가 등록되어 있다면 리스너를 먼저 호출
    - 리스너가 false를 반환하면 onTouchEvent() 호출
 */
/*
    터치 이벤트 리스너의 필요성
    - 터치 이벤트를 받기 위해서는 늘 뷰를 상속받아 재정의해아만 함
    - 특히 뷰/뷰그룹을 레이아웃 XML을 통해 생성하는 경우에는 상속받기가 애매해짐
*/

// 터치 이벤트 리스너 구현 방법 3 : 익명의 내부 클래스 구현
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. 레이아웃을 콘텐트 영역에 설정
        setContentView(R.layout.activity_main);

        // 2. 레이아웃에 포함된 버튼 객체 참조
        Button button = (Button) findViewById(R.id.button_view);

        // 3. 버튼에 터치 이벤트 리스너 객체를 생성 및 설정
        button.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("superdroid", "Button View onTouch() >> " + motionEvent.getAction());

                return false;
            }
        });
    }
}