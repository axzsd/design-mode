package com.wl.creational.abstractfactorypattern.concrete.android;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;
import com.wl.creational.abstractfactorypattern.framework.factory.GameFactory;
import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class AndroidFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperation();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterface();
    }
}
