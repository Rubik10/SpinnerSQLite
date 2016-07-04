package com.rubik.spinnersqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.rubik.spinnersqlite.db.SQLiteHandler;
import com.rubik.spinnersqlite.db.SQLiteManager;
import com.rubik.spinnersqlite.model.Categories;
import com.rubik.spinnersqlite.model.CategoriesSQL;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatabase();
        SpinnerController controller = new SpinnerController(this);
        controller.loadSpinnerData();
    }


    private void initDatabase() {
        SQLiteHandler sqlHandler = new SQLiteHandler(getApplicationContext());
        SQLiteManager.initialize(sqlHandler);
        if (SQLiteManager.isDbEmmty()) {
            insertTestData();  //TODO : TEST

        }

    }
    private void insertTestData() {

        CategoriesSQL categories = new CategoriesSQL();
        categories.addCategory(new Categories("Movies"));
        categories.addCategory(new Categories("TV Shows"));
        categories.addCategory(new Categories("Cars"));
        categories.addCategory(new Categories("Actors"));

        Log.d(TAG, " Categorys Insertadas");

    }

}
