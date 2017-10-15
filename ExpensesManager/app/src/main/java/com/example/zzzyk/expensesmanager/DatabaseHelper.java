package com.example.zzzyk.expensesmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zzzyk on 10/15/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String USER_TABLE = "user_table";
    private static final String USER_COL_USERNAME = "Username";
    private static final String USER_COL_PASSWORD = "Password";

    public DatabaseHelper (Context context) { super(context, USER_TABLE, null, 1); }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
