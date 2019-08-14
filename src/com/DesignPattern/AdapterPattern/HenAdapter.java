package com.DesignPattern.AdapterPattern;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-12-22 22-02-07
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class HenAdapter {
    private Hen hen;

    public HenAdapter(Hen hen) {
        this.hen = hen;
    }

    public void hatch() {
        hen.hatch();
    }
}
