package com.DesignPattern.BuilderPattern;

import java.util.ArrayList;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-09 09-04-15
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class ItemBuilder {
    private ArrayList<Item> ai = new ArrayList<Item>();

    public ItemBuilder() {}

    public ItemBuilder(ArrayList<Item> ai) {
        this.ai = ai;
    }

    public void addItem(Item item) {
        ai.add(item);
    }

    public void show() {
        for ( Item item : ai ) {
            item.saySomething();
        }
    }
}
