package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class A2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        // 액티비티 재사용 확인을 위한 로그
        Log.i("superdroid", "onNewIntent()");
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
        Intent intent = new Intent(this, A3Activity.class);

        startActivity(intent);
    }
}