package com.DesignPattern.AdapterPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-22 22-03-37
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class Duck {
//    this can be delayed until necessary;
//    or it can just be a local variable in the func body, not a member variable
    private HenAdapter henAdapter;

    public Duck() {
//        TODO
    }

//    the adapter can be rebuild to be more complex, to have more layers of delegation, etc. but no necessary for now
//    we have very limited purposes here to achieve
    public void hatch() {
        henAdapter = new HenAdapter(new Hen());
        henAdapter.hatch();
    }

    public void call() {
        System.out.println("this is a duck calling. By the way, it is a fake hen.");
    }
}
