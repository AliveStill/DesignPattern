package com.DesignPattern.PrototypePattern;

import sun.util.cldr.CLDRLocaleDataMetaInfo;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-16 16-57-32
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class PrototypeDemo {
    public static void main(String[] args) {
        Prototype pro1 = new Prototype(new Hat());
        Prototype pro2 = new Prototype(new Shirt());
        Prototype pro3 = new Prototype(new Socket());

        Clothes clo1 = null;
        Clothes clo2 = null;
        Clothes clo3 = null;
        try {
            clo1 = (Clothes) pro1.retClone();
            clo2 = (Clothes) pro2.retClone();
            clo3 = (Clothes) pro3.retClone();
        } catch ( CloneNotSupportedException e ) {
            e.printStackTrace();
        }

        clo1.saySomething();
        clo2.saySomething();
        clo3.saySomething();
    }
}
