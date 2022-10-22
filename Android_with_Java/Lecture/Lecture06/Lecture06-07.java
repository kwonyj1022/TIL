package com.example.lecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{

    public boolean onLongClick(View v) {
        switch(v.getId()) {
            case R.id.button_view:
                Toast.makeText(this, "OnLongClick Event!", Toast.LENGTH_LONG).show();
                return true;    // 클릭은 발동 안함
        }
        return false;   // 클릭 발동
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_view);

        button.setOnLongClickListener(this);
    }
}
