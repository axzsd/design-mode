package com.wl.creational.simplefactorypattern;

import com.wl.creational.simplefactorypattern.factory.GeometrySimpleFactory;
import com.wl.creational.simplefactorypattern.framework.Geometry;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = GeometrySimpleFactory.geometryFactory("yzx");
        geometry.draw();
        geometry.erase();
    }
}
