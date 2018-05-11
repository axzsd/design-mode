package com.wl.creational.builderpattern.realize;

import com.wl.creational.builderpattern.framework.PlayerBuilder;

public class BasicPlayerBuilder extends PlayerBuilder {

    public BasicPlayerBuilder() {
        this.player = new BasciPlayer();
    }

    @Override
    public void setMenu() {
        player.setMenu();
    }

    @Override
    public void playlist() {
        player.playlist();
    }

    @Override
    public void display() {
        player.display();
    }

    @Override
    public void controlStrip() {
        player.controlStrip();
    }

    @Override
    public void collectList() {
        player.collectList();
    }
}
