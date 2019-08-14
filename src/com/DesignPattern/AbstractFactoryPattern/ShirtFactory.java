package com.DesignPattern.AbstractFactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-11-40
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class ShirtFactory implements AbstractClothesFactory {
    @Override
    public Clothes createShirt(String string) {
        Shirt shirt = null;
        switch ( string ) {
            case "BlueShirt": shirt = new BlueShirt(); break;
            case "RedShirt" : shirt = new RedShirt();  break;
            case "YellowShirt": shirt = new YellowShirt(); break;
        }
        return shirt;
    }
}
