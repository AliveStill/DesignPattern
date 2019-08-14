package com.DesignPattern.AdapterPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-22 22-10-56
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class AdapterDemo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.hatch();
        duck.call();
    }
}
