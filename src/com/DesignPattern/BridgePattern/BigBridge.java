package com.DesignPattern.BridgePattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-13-10 10-38-42
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class BigBridge implements Bridge {
    @Override
    public void saySomething() {
        System.out.println("This is a big bridge");
    }
}
