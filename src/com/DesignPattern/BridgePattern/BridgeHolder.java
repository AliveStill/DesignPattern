package com.DesignPattern.BridgePattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-13-10 10-41-25
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public abstract class BridgeHolder {
    protected Bridge bridge;

    public abstract void shakeHands();

    public void saySomething() {
        bridge.saySomething();
    }
}
