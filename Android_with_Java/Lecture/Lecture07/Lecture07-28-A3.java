package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class A3Activity extends AppCompatActivity {
    TextView mTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        Log.i("superdroid", "onCreate()");

        // 전달받은 인텐트의 내용을 텍스트뷰에 출력한다.
        String caller = getIntent().getStringExtra("CALLER");

        mTextView = findViewById(R.id.text);
        mTextView.setText(caller);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.i("superdroid", "onNewIntent()");

        // A3 액티비티가 재사용되어 onNewIntent가 실행되면 새로 받은 인텐트 내용을 텍스트뷰에 출력한다.
        String caller = intent.getStringExtra("CALLER");
        mTextView.setText(caller);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("superdroid", "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("superdroid", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("superdroid", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("superdroid", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("superdroid", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("superdroid", "onDestroy()");
    }
    public void onClick (View v) {
        // A3 애티비티를 실행할 인텐트 엑스트라에 A3가 실행함을 의미하는 A3 문자열을 같이 전달한다.
        Intent intent = new Intent(this, A3Activity.class);
        intent.putExtra("CALLER", "A3");

        startActivity(intent);
    }
}