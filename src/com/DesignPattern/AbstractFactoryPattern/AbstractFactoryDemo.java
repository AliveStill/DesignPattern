package com.DesignPattern.AbstractFactoryPattern;

import com.DesignPattern.FactoryPattern.Factory;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-40-48
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class AbstractFactoryDemo {
    public static void main(String[] args) {
//        first build a factory instance and then use it to create entry is also ok
        Clothes hat1 = FactoryProducer.createFactory("Hat").createHat("BlueHat");
        Clothes hat2 = FactoryProducer.createFactory("Hat").createHat("RedHat");
        Clothes hat3 = FactoryProducer.createFactory("Hat").createHat("YellowHat");

        Clothes shirt1 = FactoryProducer.createFactory("Shirt").createShirt("BlueShirt");
        Clothes shirt2 = FactoryProducer.createFactory("Shirt").createShirt("RedShirt");
        Clothes shirt3 = FactoryProducer.createFactory("Shirt").createShirt("YellowShirt");

        Clothes socket1 = FactoryProducer.createFactory("Socket").createSocket("BlueSocket");
        Clothes socket2 = FactoryProducer.createFactory("Socket").createSocket("RedSocket");
        Clothes socket3 = FactoryProducer.createFactory("Socket").createSocket("YellowSocket");

        hat1.saySomething();
        hat2.saySomething();
        hat3.saySomething();
        System.out.println("");

        shirt1.saySomething();
        shirt2.saySomething();
        shirt3.saySomething();
        System.out.println("");

        socket1.saySomething();
        socket2.saySomething();
        socket3.saySomething();
        System.out.println("");
    }
}
