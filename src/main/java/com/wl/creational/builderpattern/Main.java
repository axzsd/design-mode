package com.wl.creational.builderpattern;

import com.wl.creational.builderpattern.framework.Player;
import com.wl.creational.builderpattern.framework.PlayerBuilder;
import com.wl.creational.builderpattern.realize.BasicPlayerBuilder;

public class Main {
    public static void main(String [] args) {
        // 标准
        PlayerBuilder builder = new BasicPlayerBuilder();
        Player criterion = builder.criterion();
        criterion.display();

        // 记忆
        builder = new BasicPlayerBuilder();
        Player memory = builder.memory();
        memory.display();

        // 精简
        builder = new BasicPlayerBuilder();
        Player simplify = builder.simplify();
        simplify.display();
    }
}
