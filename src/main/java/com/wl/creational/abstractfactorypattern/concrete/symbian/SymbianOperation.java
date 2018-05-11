package com.wl.creational.abstractfactorypattern.concrete.symbian;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;

public class SymbianOperation implements OperationController {
    @Override
    public void operation() {
        System.out.println("Symbian 操作控制");
    }
}
