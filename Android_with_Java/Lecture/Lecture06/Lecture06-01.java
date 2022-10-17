// UI 작성 방법 3 : XML과 코드를 동시에 사용해서 사용자 인터페이스 작성
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /*
        Log.d 의 .d 는 debug 의미
        Log.i 의 .i 는 info 의미
        Android Studio 에서 Logcat에 message가 뜨는데, 검색창에 Tag명 쓰면 해당 Tag가 붙은 message만 보이게 할 수 있음
        dispatchTouchEvent가 onTouchEvent 보다 먼저 호출됨
     */
    /*
        getAction() : 터치 이벤트의 액션값이 전달되며 종류는 다음과 같다
                        - ACTION_DOWN = 0
                        - ACTION_UP = 1
                        - ACTION_MOVE = 2
                        ACTION_CANCEL = 3
        getX() : 이벤트가 발생한 X축 좌표 위치
        getY() : 이벤트가 발생한 Y축 좌표 위치
        getEventTime() : 이벤트가 발생한 시간 (밀리세컨드, 즉 1초의 1000분의 1) (시간 정보는 부팅한 시점부터 이벤트가 발생한 시점까지임)
        getDownTime() : 다운 이벤트가 발생한 시간 (밀리세컨드 단위)
                        다운, 이봉, 업 이벤트를 하나의 단위로 보아야 함 (move 동작이 있다면 ActionCode는 바뀌어도 Down Event Time은 안 바뀜)
     */

    /* 액티비티의 dispatchTouchEvent 함수 재정의 */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        // 터치 이벤트 정보에 대한 로그를 남김
        Log.d("superdroid", "==================================");
        Log.d("superdroid", "dispatchTouchEvent()");
        Log.d("superdroid", "- ActionCode : " + ev.getAction());
        Log.d("superdroid", "- XY Position : " + ev.getX() + "," + ev.getY());
        Log.d("superdroid", "- Event Time : " + ev.getEventTime());
        Log.d("superdroid", "- Down Event Time : " + ev.getDownTime());

        return super.dispatchTouchEvent(ev);
    }

    /* 액티비티의 onTouchEvent 함수 재정의 */
    @Override
    public boolean onTouchEvent(MotionEvent event){
        Log.i("superdroid", "==================================");
        Log.i("superdroid", "onTouchEvent()");
        Log.i("superdroid", "- ActionCode : " + event.getAction());
        Log.i("superdroid", "- XY Position : " + event.getX() + "," + event.getY());
        Log.i("superdroid", "- Event Time : " + event.getEventTime());
        Log.i("superdroid", "- Down Event Time : " + event.getDownTime());

        return super.onTouchEvent(event);
    }
}