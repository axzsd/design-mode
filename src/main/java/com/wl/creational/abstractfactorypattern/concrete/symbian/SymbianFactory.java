package com.wl.creational.abstractfactorypattern.concrete.symbian;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;
import com.wl.creational.abstractfactorypattern.framework.factory.GameFactory;
import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class SymbianFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperation();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterface();
    }
}
