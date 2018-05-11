package com.wl.creational.abstractfactorypattern.concrete.windows;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;

public class WindowsOperation implements OperationController {
    @Override
    public void operation() {
        System.out.println("Windows 操作控制");
    }
}
