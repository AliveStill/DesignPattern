package com.DesignPattern.BuilderPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-09 09-05-31
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Family {
    ItemBuilder itemBuilder;

    public Family(ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    public void addItem(Item item) {
        itemBuilder.addItem(item);
    }

    public void show() {
        itemBuilder.show();
    }
}
