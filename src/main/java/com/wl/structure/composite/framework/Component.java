package com.wl.structure.composite.framework;

public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    void show();
    void action();
}
