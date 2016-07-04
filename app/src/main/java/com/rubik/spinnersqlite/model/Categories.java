package com.rubik.spinnersqlite.model;

/**
 * Created by Rubik on 19/6/16.
 * Model Of Categories
 */
public class Categories {
    private int idCategory;
    private String category;
   // private Images image;

    public Categories () {}

    public Categories (int id, String cat) {
        this.idCategory = id;
        category=cat;
    }

    public Categories (String cat) {
        category=cat;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   /* public Images getImage() {
        return image;
    }

    public void setImage(Images image) {
        this.image = image;
    }*/
}

