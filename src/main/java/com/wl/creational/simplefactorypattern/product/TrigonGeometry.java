package com.wl.creational.simplefactorypattern.product;

import com.wl.creational.simplefactorypattern.framework.Geometry;

public class TrigonGeometry implements Geometry {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
