package com.wl.creational.abstractfactorypattern;

import com.wl.creational.abstractfactorypattern.concrete.android.AndroidFactory;
import com.wl.creational.abstractfactorypattern.framework.factory.GameFactory;

public class Main {
    public static void main(String [] args) {
        GameFactory gameFactory = new AndroidFactory();
        gameFactory.createOperationController().operation();
        gameFactory.createInterfaceController().display();
    }
}
