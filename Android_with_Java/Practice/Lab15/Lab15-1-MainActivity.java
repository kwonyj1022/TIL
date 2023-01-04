package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private Button btn2;
    private Button btn3;

    private FragmentManager manager;
    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.main_btn1);
        btn2 = findViewById(R.id.main_btn2);
        btn3 = findViewById(R.id.main_btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        manager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();
    }

    @Override
    public void onClick(View v) {
        if (v == btn1) {
            if (!oneFragment.isVisible()) {
                FragmentTransaction tf = manager.beginTransaction();
                tf.replace(R.id.main_container, oneFragment);
//                tf.addToBackStack(null);
                tf.commit();
            }
        } else if (v == btn2) {
            if (!twoFragment.isVisible()) {
                twoFragment.show(manager, null);
            }
        } else if (v == btn3) {
            if (!threeFragment.isVisible()) {
                Log.d("kkang", "111111111111");
                FragmentTransaction tf = manager.beginTransaction();
                tf.replace(R.id.main_container, threeFragment);
//                tf.addToBackStack(null);
                tf.commit();
            }
        }
    }
}