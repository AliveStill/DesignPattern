package com.DesignPattern.FactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-11 11-23-23
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public abstract class Factory {
    public static ExampleClass create(String str) {
        ExampleClass ec = null;
        switch ( str ) {
            case "Example1": ec = new Example1(); break;
            case "Example2": ec = new Example2(); break;
            case "Example3": ec = new Example3(); break;
        }
        return ec;
    }
}
