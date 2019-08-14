package com.DesignPattern.StrategyPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-10 10-54-01
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class ClientOfStrategy {
    Strategy strategy;

    public ClientOfStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void provoke() {
        strategy.saySomething();
    }
}
