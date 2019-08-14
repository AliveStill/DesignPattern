package com.DesignPattern.AbstractFactoryPattern;

public interface AbstractClothesFactory {
//    default mothod implementation is useful here, avoid some useless overrides
    default public Clothes createHat(String string) {
        return null;
    }
    default public Clothes createShirt(String string) {
        return null;
    }
    default public Clothes createSocket(String string) {
        return null;
    }
}
