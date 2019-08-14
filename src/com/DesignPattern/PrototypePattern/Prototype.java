package com.DesignPattern.PrototypePattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-16 16-47-28
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Prototype {
    private Clothes clothes;

//    construct through the parameters
    public Prototype(Clothes clothes) {
        this.clothes = clothes;
    }

    public void saySomething() {
        clothes.saySomething();
    }

    public Object retClone() throws CloneNotSupportedException {
        return clothes.clone();
    }
}
