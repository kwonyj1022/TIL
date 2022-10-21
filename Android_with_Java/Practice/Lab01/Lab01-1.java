package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);

        Button btn1 = new Button(this);
        Button btn2 = new Button(this);
        btn1.setText("BUTTON 1");
        btn2.setText("BUTTON 2");

        linear.addView(btn1);
        linear.addView(btn2);

        setContentView(linear);
    }
}