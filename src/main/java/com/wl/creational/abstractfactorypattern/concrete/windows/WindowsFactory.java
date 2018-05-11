package com.wl.creational.abstractfactorypattern.concrete.windows;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;
import com.wl.creational.abstractfactorypattern.framework.factory.GameFactory;
import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class WindowsFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsOperation();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterface();
    }
}
