package com.DesignPattern.SingletonPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-55-04
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.createInstance();
        Singleton single    = Singleton.createInstance();
        if ( singleton == single ) {
            System.out.println("singleton");
        }
    }
}
