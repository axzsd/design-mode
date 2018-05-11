package com.wl.creational.builderpattern.realize;

import com.wl.creational.builderpattern.framework.Player;

public class BasciPlayer implements Player {
    private String menu;
    private String playList;
    private String controlStrip;
    private String collectList;

    @Override
    public void setMenu() {
        menu = "这是一个menu";
    }

    @Override
    public void playlist() {
        playList = "这是一个播放列表";
    }

    @Override
    public void display() {
        System.out.println("菜单：" + menu + " 播放列表：" + playList);
        System.out.println("进度条:" + controlStrip + " 我的收藏:" + collectList);
    }

    @Override
    public void controlStrip() {
        controlStrip = "当前进度 15%";
    }

    @Override
    public void collectList() {
        collectList = "我的收藏";
    }
}
