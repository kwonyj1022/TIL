// MainActivity.java 파일
package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (android.widget.TextView) findViewById(R.id.textview1);
        TextView textView2 = (android.widget.TextView) findViewById(R.id.textview2);
        TextView textView3 = (android.widget.TextView) findViewById(R.id.textview3);
        textView1.setSelected(true);
        textView2.setSelected(true);
        textView3.setSelected(true);


    }
}