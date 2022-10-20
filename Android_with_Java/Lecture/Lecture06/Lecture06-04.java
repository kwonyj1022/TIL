package com.example.lecture;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

class CustomView extends View {

    private boolean isFirstDown = true;

    public CustomView(Context context) {
        super(context);
    }

    /* 뷰의 dispatchTouchEvent 함수를 재정의한다 */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("superdroid", "CustomView dispatchTouchEvent() >> " + event.getAction());

        return super.dispatchTouchEvent(event);
    }

    /* 뷰의 onTouchEvent 함수를 재정의한다 */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("superdroid", "CustomView onTouchEvent() >> " + event.getAction());

        // 뷰에게 전달되는 첫 번째 터치 이벤트 프로세스는 부모 뷰그룹이 가로채지 않도록 설정
        // requestDisallowInterceptTouchEvent 함수 : 자식 뷰가 부모 뷰그룹에 이벤트를 가로채지 않도록 요청 (단 한번의 터치 프로세스에만 유효)
        if (isFirstDown == true && event.getAction() == MotionEvent.ACTION_DOWN) {
            getParent().requestDisallowInterceptTouchEvent(true);   // getParnet()로 부모의 참조를 얻을 수 있음
            isFirstDown = false;
        }
        return true;
    }
}

class CustomViewGroup extends FrameLayout {
    float initialY = 0;

    public CustomViewGroup(Context context) {
        super(context);
    }

    /* 뷰그룹의 dispatchTouchEvent 함수를 재정의한다 */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("superdroid", "CustomView dispatchTouchEvent() >> " + event.getAction());

        return super.dispatchTouchEvent(event);
    }

    /* 뷰그룹의 onTouchEvent 함수를 재정의한다 */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("superdroid", "CustomView onTouchEvent() >> " + event.getAction());

        // 뷰 그룹이 이벤트를 받으면 특정 처리를 하기 위해 true 리턴
        return true;
    }

    /* 뷰그룹의 onInterceptTouchEvent 함수를 재정의한다 */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("superdroid", "CustomViewGroup onInterceptTouchEvent()" + ev.getAction());

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // 터치 다운 위치의 Y 위치를 기억해 둔다
                initialY = ev.getY();
                break;

            case
                MotionEvent.ACTION_MOVE:
                // 터치 다운 Y 위치에서 20픽셀을 초과 이동되면 이벤트를 가로챈다
                if (Math.abs(initialY - getY()) >= 20)
                    return true;    // 가로챔
        }
        return super.onInterceptTouchEvent(ev);
    }
}