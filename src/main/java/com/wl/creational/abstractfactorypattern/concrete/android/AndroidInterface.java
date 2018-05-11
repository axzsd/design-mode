package com.wl.creational.abstractfactorypattern.concrete.android;

import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public class AndroidInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("Android 界面显示");
    }
}
