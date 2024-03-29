package com.example.lecture;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

class CustomView extends View {

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

        // 뷰가 이벤트를 받으면 특정 처리를 하기 위해 true 리턴
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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* 1. 뷰그룹을 생성한다 */
        // ====================================================
        CustomViewGroup viewGroup = new CustomViewGroup(this);
        viewGroup.setBackgroundColor(Color.BLUE);
        FrameLayout.LayoutParams viewGroupLp = new FrameLayout.LayoutParams(300, 300);
        // ======================================================

        /* 2. 뷰를 생성한다 */
        // ====================================================================
        CustomView view = new CustomView(this);
        view.setBackgroundColor(Color.YELLOW);
        FrameLayout.LayoutParams viewLp = new FrameLayout.LayoutParams(150, 150);
        // =========================================================================

        /* 3. 생성된 뷰를 뷰그룹에 추가한다 */
        // ==========================
        viewGroup.addView(view, viewLp);
        // ======================================

        /* 4. 컨텐츠 영역에 생성된 뷰그룹을 추가한다 */
        // =========================================
        setContentView(viewGroup, viewGroupLp);
        // ============================================
    }

}