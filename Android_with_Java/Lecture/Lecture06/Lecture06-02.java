package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

class CustomView extends View { // 모든 뷰들은 dispatchTouchEvent 함수와 onTouchEvent 함수를 가지고 있음

    public CustomView(Context context) { // 생성자가 무조건 하나는 있어야 함
        super(context); // Activity의 부모 클래스를 따라가보면 Context 클래스가 나옴
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

        return super.onTouchEvent(event);
    }
}

class CustomViewGroup extends FrameLayout {

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

        return super.onTouchEvent(event);
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