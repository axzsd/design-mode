package com.wl.creational.factorymethodpattern;

import com.wl.creational.factorymethodpattern.factory.TrigonGeometryFactory;
import com.wl.creational.factorymethodpattern.framework.Factory;
import com.wl.creational.factorymethodpattern.framework.Geometry;

/**
 * 说明：工厂方法模式（）
 * */
public class Main {
    public static void main(String [] args) {
        Factory factory = new TrigonGeometryFactory();
        Geometry geometry = factory.createGeometry();
        geometry.draw();
        geometry.erase();
    }
}
