package com.DesignPattern.SingletonPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-51-36
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Singleton {
    private static Singleton instance = null;
    private final double value = .02;

    private Singleton() {}

//    non-locked func, not safe for multiple threads
    public static Singleton createInstance() {
        if ( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }

    public void saySomething() {
        System.out.println("func");
    }

}
