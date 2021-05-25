package com.example.vaccinv2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class VaccinDatabase extends SQLiteOpenHelper {

    public VaccinDatabase(@Nullable Context context) {
        super(context, "vaccin", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE centre (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, lon TEXT, lat TEXT);";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new UnsupportedOperationException();
    }

    public List<Centre> getAll(){
        List<Centre> centres = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT id, name, lon, lat FROM centre;", null);
        if (cursor.moveToFirst()){
            while (cursor.moveToNext()){
                centres.add(new Centre(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3)
                ));
            }
        }
        cursor.close();
        return centres;
    }

    public void add(Centre centre){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", centre.getName());
        values.put("lon", centre.getLon());
        values.put("lat", centre.getLat());
        db.insert("centre", null, values);
        db.close();
    }

    /**
     * Reset the database
     */
    public void truncate(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM centre WHERE 1=1;");
        db.close();
    }
}
