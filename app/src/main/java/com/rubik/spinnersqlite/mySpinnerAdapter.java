package com.rubik.spinnersqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

    /**
     * Created by Rubik on 22/6/16.
     */
    public class mySpinnerAdapter extends ArrayAdapter<String> {

        private Context cxt;
        private String[] spinnerSubtitle = { "Cinema Category", "TV Shows Category", "Cars Category", "Actors Category" };
        private int spinnerImages[] = { R.drawable.icon_cine, R.drawable.icono_tv24dp, R.drawable.icon_car, R.drawable.icon_actor};


        public mySpinnerAdapter(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            this.cxt =  context;
        }

            @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

            @Override
        public View getView(int pos, View convertView, ViewGroup parent) {
                return getCustomView(pos, convertView, parent);
            }


        private View getCustomView(int position, View convertView, ViewGroup parent) {
                //Inflate the Layout of the Sppiner (1a linea explixa como acceder al layout desde una clase externa)
            LayoutInflater layoutInflater = (LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View mySpinnerLayout = layoutInflater.inflate(R.layout.custom_spinner,parent,false);

                // Convert the List<String> to String[] for use in the adapter - comboCategories
            String [] categories = new String[SpinnerController.comboCategories.size()];
            SpinnerController.comboCategories.toArray(categories);
                //Spinner Tittle
            TextView txtTitle = (TextView) mySpinnerLayout.findViewById(R.id.text_main_seen);
            txtTitle.setText(categories[position]);
                //Spinner Subtitle
            TextView txtSubtitle = (TextView) mySpinnerLayout.findViewById(R.id.sub_text_seen);
            txtSubtitle.setText(spinnerSubtitle[position]);
                //Spinner Icons
            ImageView imgIcons = (ImageView) mySpinnerLayout.findViewById(R.id.left_pic);
            imgIcons.setImageResource(spinnerImages[position]);


            return mySpinnerLayout;
        }

    }
