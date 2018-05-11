package com.wl.creational.abstractfactorypattern.concrete.windows;

import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class WindowsInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("Windows 界面显示");
    }
}
