package com.DesignPattern.BridgePattern;

import java.awt.image.SampleModel;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-13-10 10-46-06
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class BridgeDemo {
//    与策略模式唯一不同的是，桥接器模式将抽象接口交由抽象父类进行掌管，由子类来进行实例化
//    可见策略模式是桥接器模式的一个子集
    public static void main(String[] args) {
        DerivedClass derivedClass1 = new DerivedClass(new BigBridge());
        DerivedClass derivedClass2 = new DerivedClass(new SmallBridge());

        derivedClass1.saySomething();
        derivedClass1.shakeHands();

        derivedClass2.saySomething();
        derivedClass2.shakeHands();
    }
}
