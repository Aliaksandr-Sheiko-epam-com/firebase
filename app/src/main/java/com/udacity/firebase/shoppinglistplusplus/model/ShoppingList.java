package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by user on 06.11.2016.
 */

public class ShoppingList {
    private String listName;
    private String owner;

    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "listName='" + listName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
