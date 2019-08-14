package com.DesignPattern.PrototypePattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-16 16-47-50
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public abstract class Clothes implements Cloneable {
    public abstract void saySomething();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
