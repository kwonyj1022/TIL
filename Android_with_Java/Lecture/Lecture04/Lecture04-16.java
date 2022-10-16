// MainActivity.java 파일
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        Toast.makeText(this, "버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
    }
}