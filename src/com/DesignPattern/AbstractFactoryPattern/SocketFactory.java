package com.DesignPattern.AbstractFactoryPattern;

import java.nio.channels.AsynchronousByteChannel;

/********************************************************
 *@program:
 *@version: 1.0
 *@author: lingh
 *@create: 2019-08-11-17 17-10-25
 *@description: The author is too lazy to leave anything.
 ********************************************************/
public class SocketFactory implements AbstractClothesFactory {
    @Override
    public Clothes createSocket(String string) {
        Socket socket = null;
        switch ( string ) {
            case "BlueSocket": socket = new BlueSocket(); break;
            case "RedSocket" : socket = new RedSocket();  break;
            case "YellowSocket": socket = new YellowSocket(); break;
        }
        return socket;
    }
}
