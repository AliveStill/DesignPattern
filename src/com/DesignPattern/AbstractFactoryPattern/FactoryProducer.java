package com.DesignPattern.AbstractFactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-08 08-19-50
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class FactoryProducer {
    public static AbstractClothesFactory createFactory(String string) {
        AbstractClothesFactory abFactory = null;
        switch ( string ) {
            case "Hat"      : abFactory = new HatFactory(); break;
            case "Shirt"    : abFactory = new ShirtFactory(); break;
            case "Socket"   : abFactory = new SocketFactory(); break;
        }
        return abFactory;
    }
}
