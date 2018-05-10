package com.wl.creational.simplefactorypattern;

import com.wl.creational.simplefactorypattern.factory.GeometrySimpleFactory;
import com.wl.creational.simplefactorypattern.framework.Geometry;

/**
 * 说明：简单工厂模式
 * */
public class Main {
    public static void main(String[] args) {
        Geometry geometry = GeometrySimpleFactory.geometryFactory("sjx");
        geometry.draw();
        geometry.erase();
    }
}
