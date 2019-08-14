package com.DesignPattern.BuilderPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-09 09-12-43
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Fridge extends ElectricAppliance implements Useable {
    @Override
    public void saySomething() {
        System.out.println("I am a fridge. I am useable");
    }
}
