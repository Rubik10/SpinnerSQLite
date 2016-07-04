package com.rubik.spinnersqlite;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Spinner;

import com.rubik.spinnersqlite.model.CategoriesSQL;

import java.util.List;

/**
 * Created by Rubik on 22/6/16.
 */
public class SpinnerController {

    private static final String TAG = SpinnerController.class.getSimpleName();

    private static Activity activity;
    private Context cxt;
    protected static List<String> comboCategories;

    public SpinnerController(Context context) {
        this.cxt= context;
        activity = (MainActivity) cxt;
    }

    /**
         * Function to load the spinner data from SQLite database
     * */
    public void loadSpinnerData() {
        Log.d(TAG, " LoadSpinnerData");
            //Spinner element
        Spinner spinner = (Spinner) activity.findViewById(R.id.spinner);
            // Spinner Drop down elements
        CategoriesSQL cateogies = new CategoriesSQL();
        comboCategories = cateogies.getAllCategories();
            // Creating adapter for spinner
        mySpinnerAdapter adapter = new mySpinnerAdapter(cxt,R.layout.custom_spinner,comboCategories);
            // Drop down layout style -
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // attaching data adapter to spinner
        spinner.setAdapter(adapter);

            //Spinner Listeener
        SpinnerListenerHandler listener = new SpinnerListenerHandler();
        spinner.setOnItemSelectedListener(listener);

    }

}
