package com.wl.structure.composite.framework.concrete;

import com.wl.structure.composite.framework.Component;

public class Text implements Component {
    private String name;

    public Text(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("不支持该操作");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不支持该操作");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("不支持该操作");
        return null;
    }

    @Override
    public void show() {
        System.out.println("显示Text：" + name);
    }

    @Override
    public void action() {
        System.out.println(name + "Text：" + "鼠标移上来");
    }
}
