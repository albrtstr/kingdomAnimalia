package com.example.kingdomanimalia.DbHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "kindomAnimalia.db";
    private static final int DB_VERSION= 1;

    public DbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAMA TEXT );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS USER");
        onCreate(db);
    }

    public void inserData(String nama) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAMA", nama);
        this.getWritableDatabase().insertOrThrow("USER","",contentValues);
    }

    public int getData() {
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM USER",null);
        if(cursor.getCount() > 0) {
            return 1;
        }else{
            return 0;
        }
    }

    public void delt() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM USER");
    }
}
