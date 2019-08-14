package com.DesignPattern.AbstractFactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-11-05
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class HatFactory implements AbstractClothesFactory {
    @Override
    public Clothes createHat(String string) {
        Hat hat = null;
        switch ( string ) {
            case "BlueHat": hat = new BlueHat(); break;
            case "RedHat" : hat = new RedHat();  break;
            case "YellowHat": hat = new YellowHat(); break;
        }
        return hat;
    }
}
