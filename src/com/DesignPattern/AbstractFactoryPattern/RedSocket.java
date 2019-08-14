package com.DesignPattern.AbstractFactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-19-19
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class RedSocket extends Socket {
    @Override
    public void saySomething() {
        System.out.println("this is a red socket");
    }
}
