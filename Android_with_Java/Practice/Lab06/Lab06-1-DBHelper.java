package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, "memodb", null, DATABASE_VERSION);
    }

    /**
     * 앱이 설치된 후 SQLiteOpenHelper가 최초로 이용되는 순간 한 번 호출
     * 대부분 테이블을 생성하는 코드 작성
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String memoSQL = "create table tb_memo (" +
                "_id integer primary key autoincrement, " +     // column 1은 _id이고, 형식은 integer고 primary key (겹치는 값 X. 유일)
                "title, " +     // column2는 title이고, 형식 지정 안했으므로 String 형식
                "content)";     // column3은 content고, 형식 지정 안했으므로 String 형식
        db.execSQL(memoSQL);
    }

    /**
     * SQLiteOpenHelper 클래스의 생성자에 전달되는 데이터베이스 버전 정보가 변경될 때마다 호출
     * 테이블의 스키마 부분을 변경하기 위한 용도로 사용용
     *@param db : oldVersion의 DB 파일을 연 SQLiteDatabase 객체
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion == DATABASE_VERSION) {
            db.execSQL("drop table tb_memo");
            onCreate(db);
        }
    }
}
