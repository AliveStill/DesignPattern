package com.DesignPattern.FactoryPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-11 11-32-29
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ExampleClass ec1 = Factory.create("Example1");
        ExampleClass ec2 = Factory.create("Example2");
        ExampleClass ec3 = Factory.create("Example3");

        ec1.saySomething();
        ec2.saySomething();
        ec3.saySomething();
    }
}
