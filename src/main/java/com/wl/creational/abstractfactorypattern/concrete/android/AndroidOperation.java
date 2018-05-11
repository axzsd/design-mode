package com.wl.creational.abstractfactorypattern.concrete.android;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;

public class AndroidOperation implements OperationController {
    @Override
    public void operation() {
        System.out.println("Android 操作控制");
    }
}
