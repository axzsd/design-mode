package com.wl.creational.abstractfactorypattern.concrete.symbian;

import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class SymbianInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("Symbian 界面显示");
    }
}
