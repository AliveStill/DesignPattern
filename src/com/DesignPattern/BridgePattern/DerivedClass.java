package com.DesignPattern.BridgePattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-13-10 10-43-49
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class DerivedClass extends BridgeHolder {
    public DerivedClass(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void shakeHands() {
        System.out.println("we are shaking hands");
    }
}
