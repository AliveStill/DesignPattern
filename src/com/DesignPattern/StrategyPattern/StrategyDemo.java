package com.DesignPattern.StrategyPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-10 10-52-33
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class StrategyDemo {
    public static void main(String[] args) {
        ClientOfStrategy cs1 = new ClientOfStrategy(new Strategy_1());
        ClientOfStrategy cs2 = new ClientOfStrategy(new Strategy_2());

        cs1.provoke();
        cs2.provoke();
    }
}
