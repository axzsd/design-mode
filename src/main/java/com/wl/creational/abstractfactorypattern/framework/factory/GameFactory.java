package com.wl.creational.abstractfactorypattern.framework.factory;

import com.wl.creational.abstractfactorypattern.framework.control.OperationController;
import com.wl.creational.abstractfactorypattern.framework.screen.InterfaceController;

public interface GameFactory {
    /**
     * 说明：创建游戏控制类
     * */
    public OperationController createOperationController();

    /**
     * 说明：创建游戏操作显示类
     * */
    public InterfaceController createInterfaceController();
}
