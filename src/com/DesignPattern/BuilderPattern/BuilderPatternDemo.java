package com.DesignPattern.BuilderPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-09 09-17-53
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Family family = new Family(new ItemBuilder());

        family.addItem(new Fruits());
        family.addItem(new Vegetables());
        family.addItem(new Fridge());
        family.addItem(new Computer());

        family.show();
    }
}
