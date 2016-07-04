package com.rubik.spinnersqlite;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.rubik.spinnersqlite.model.Categories;

/**
     * Created by Rubik on 22/6/16.
     */
    public class SpinnerListenerHandler implements AdapterView.OnItemSelectedListener {
        private static final String TAG = SpinnerListenerHandler.class.getSimpleName();

            @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Log.d(TAG, "onItemSelected: " + position);

            // On selecting a spinner item
            String label = parent.getItemAtPosition(position).toString();
            Categories catSelect = new Categories( (Integer.parseInt(String.valueOf(id)) + 1) , label);

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "You selected: " + catSelect.getCategory() + "  ID : " + catSelect.getIdCategory(), Toast.LENGTH_LONG).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
