package com.example.lecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void onMyButtonClick(View v) {
        switch(v.getId()) {
            case R.id.button_view:
                Toast.makeText(this, "OnClick Event!", Toast.LENGTH_LONG).show();
                break
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
