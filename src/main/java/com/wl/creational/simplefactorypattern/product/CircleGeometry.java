package com.wl.creational.simplefactorypattern.product;

import com.wl.creational.simplefactorypattern.framework.Geometry;

public class CircleGeometry implements Geometry {
    @Override
    public void draw() {
        System.out.println("绘画出了圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了圆形");
    }
}
