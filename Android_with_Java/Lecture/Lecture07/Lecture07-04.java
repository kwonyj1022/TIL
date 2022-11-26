package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Parcel 객체를 생성하고 데이터를 쓴다.
        Parcel parcel = Parcel.obtain();    //  public static Parcel obtain() : Parcel 객체를 반환하는 함수
        parcel.writeInt(10);
        parcel.writeString("Superdroid");

        // 2. Parcel 객체에 저장된 데이터를 읽어서 화면에 출력한다.
        TextView receivedStr = findViewById(R.id.intent_received_data);
            // Parcel 객체는 직렬화된 데이터 형식으로 저장하므로 꼭 데이터를 추가한 순서대로 읽어야 한다.
            // 만일 쓴 순서대로 읽지 않으면 엉뚱한 값을 참조하게 된다.
        parcel.setDataPosition(0);
        receivedStr.setText("SampleData : " +
                parcel.readInt() + ", " +
                parcel.readString());
    }
}