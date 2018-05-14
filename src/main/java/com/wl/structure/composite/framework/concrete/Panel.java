package com.wl.structure.composite.framework.concrete;

import com.wl.structure.composite.framework.Component;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {
    private List<Component> components = new ArrayList<>();

    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void show() {
        System.out.println("显示Panel：" + name);
        for (Component component : components)
            component.show();
    }

    @Override
    public void action() {
        System.out.println(name + "Panel：" + "鼠标移上来");
        for (Component component : components)
            component.action();
    }
}
