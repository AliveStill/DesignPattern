package com.DesignPattern.AdapterPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-21 21-59-04
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Hen implements Hatchable {
    public Hen() {
//        TODO
    }

    @Override
    public void hatch() {
        System.out.println("the hen is hatching");
    }
}
