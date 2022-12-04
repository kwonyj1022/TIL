package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onClick(View v) {
        startActivity(new Intent(this, BActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * 액티비티가 처음에 만들어졌을 때 호출됨
         * 화면에 보이는 뷰들의 일반적인 상태를 설정하는 부분
         * 이전 상태가 저장되어 있는 경우에는 번들 객체를 참조하여 이전 상태 복원 가능
         * 이 메소드 다음에는 항상 onStart() 메소드가 호출됨
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("superdroid", "onCreate()");
    }

    @Override
    protected void onRestart() {
        /**
         * onStart()는 onStop()과 onCreate() 두 곳으로부터 호출될 수 있어 구분이 어려움
         * 이러한 구분이 중요한 경우에 onRestart() 사용 (stopped 상태에 있다가 다시 시작될 때 필요한 동작을 넣으면 됨)
         */
        super.onRestart();
        Log.i("superdroid", "onRestart()");
    }

    @Override
    protected void onStart() {
        /**
         * onCreate() 다음에 호출될 수도 있고, onRestart() 다음에 호출될 수도 있음
         * 액티비티가 화면에 보이기 바로 전에 호출됨 (onStart()가 리턴이 되어야 화면에 보임)
         * 액티비티가 화면 상에 보이면 이 메소드 다음에 onResume() 메소드가 호출됨
         */
        super.onStart();
        Log.i("superdroid", "onStart()");
    }

    @Override
    protected void onResume() {
        /**
         * 액티비티가 사용자와 상호작용하기 바로 전에 호출됨
         * 액티비티가 동작 중인 상태를 resumeed 상태라고 함
         */
        super.onResume();
        Log.i("superdroid", "onResume()");
    }

    @Override
    protected void onPause() {
        /**
         * 또 다른 액티비티를 시작하려고 할 때 호출됨
         * 저장되지 않은 데이터를 저장소에 저장하거나 애니메이션 중인 작업을 중지하는 등의 기능을 수행하는 메소드임
         * 이 메소드가 리턴하기 전에는 다음 액티비티가 시작될 수 없으므로 이 작업은 매우 빨리 수행된 후 리턴되어야 함 (시간이 오래 걸리는 작업을 넣으면 안 됨)
         * 액티비티가 이 상태에 들어가면 시스템은 액티비티를 강제 종료할 수 있음 (아주 드문 경우)
         * resumed 상태에 있다가 새로운 액티비티를 띄우자 다른 액티비티 뒤에 있게 되지만 화면이 꺼진건 아닌 상태를 paused 상태라고 함
         */
        super.onPause();
        Log.i("superdroid", "onPause()");
    }

    @Override
    protected void onStop() {
        /**
         * 액티비티가 사용자에게 더 이상 보이지 않을 때 호출됨 (onStop()이 리턴된 후에는 확실하게 화면이 안 보임)
         * 액티비티가 소멸되거나 또 다른 액티비티가 화면을 가릴 때 호출됨
         * onStop() 이후 다시 실행되기 전까지의 상태를 stopped 상태라고 함 (화면에도 안 보이고 이벤트 처리도 안 됨)
         * 액티비티가 이 상태에 들어가면 시스템은 액티비티를 강제 종료할 수 있음
         */
        super.onStop();
        Log.i("superdroid", "onStop()");
    }

    @Override
    protected void onDestroy() {
        /**
         * 액티비티가 소멸되어 없어지기 전에 호출됨
         * 이 메소드는 액티비티가 받는 마지막 호출이 됨
         * 액티비티가 애플리케이션에 의해 종료되거나(finish() 메소드 호출) 시스템이 강제로 종료시키는 경우 호출될 수 있음
         * 위의 두 가지 경우를 구분할 때 isFinishing() 메소드 이용 (finish() 메소드 또는 back 버튼에 의해 호출된 경우 true 리턴, 시스템에 의한 강제종료인 경우 false 리턴)
         * 시스템이 강제종료 시킬 경우 onDestroy()가 호출이 될 수도 있고, 안 될 수도 있음 (무조건 호출되는건 아님)
         * 액티비티가 이 상태에 들어가면 시스템은 액티비티를 강제종료할 수 있음
         * onDestroy()가 리턴된다고 해서 객체가 바로 사라지는 것은 아님 (관리만 끝나고, 더이상 소용없게 되면 나중에 가비지 컬렉션을 통해 정리됨)
         */
        super.onDestroy();
        Log.i("superdroid", "onDestroy()");
    }
}