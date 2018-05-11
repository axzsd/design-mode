package com.wl.creational.builderpattern.framework;

public abstract class PlayerBuilder {

    protected Player player;

    // 设置菜单
    public abstract void setMenu();

    // 设备播放列表
    public abstract void playlist();

    // 显示主窗口
    public abstract void display();

    // 设置控制条
    public abstract void controlStrip();

    // 收藏列表
    public abstract void collectList();

    // 精简模式
    public Player simplify() {
        this.controlStrip();
        return this.builder();
    }

    // 标准模式
    public Player criterion() {
        this.setMenu();
        this.playlist();
        this.controlStrip();
        this.collectList();
        return builder();
    }

    // 记忆模式
    public Player memory() {
        this.collectList();
        this.controlStrip();
        return builder();
    }

    public Player builder() {
        return player;
    }
}
