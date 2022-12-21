package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] arrayData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView arrayView = findViewById(R.id.main_listview_array);
        arrayView.setOnItemClickListener(this);
        ListView simpleView = findViewById(R.id.main_listview_simple);
        ListView cursorView = findViewById(R.id.main_listview_cursor);

        arrayData = getResources().getStringArray(R.array.location);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayData);
        arrayView.setAdapter(arrayAdapter);                     // android.R.layout.simple_list_item_1 : 안드로이드에서 제공. 항목에 문자열 데이터 하나


        ArrayList<HashMap<String, String>> simpleData = new ArrayList<>();
        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from tb_data", null);
        while(cursor.moveToNext()) {
            HashMap<String, String> map = new HashMap<>();
            map.put("name", cursor.getString(1));
            map.put("content", cursor.getString(2));
            simpleData.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,
                simpleData,
                android.R.layout.simple_list_item_2,    // 항목에 문자열 데이터 두 개 위아래 나열
                new String[]{"name", "content"},
                new int[]{android.R.id.text1, android.R.id.text2});     // key가 name인 value에 대응하는 텍스트, key가 content인 value에 대응하는 텍스트
        simpleView.setAdapter(adapter);


        CursorAdapter cursorAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_2,
                cursor,
                new String[]{"name", "content"},
                new int[]{android.R.id.text1, android.R.id.text2},
                CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        cursorView.setAdapter(cursorAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this, arrayData[position], Toast.LENGTH_SHORT).show();
    }
}