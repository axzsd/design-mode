package com.wl.creational.factorymethodpattern.factory;

import com.wl.creational.factorymethodpattern.framework.Factory;
import com.wl.creational.factorymethodpattern.framework.Geometry;
import com.wl.creational.factorymethodpattern.product.CircleGeometry;

public class CircleGeometryFacory implements Factory {
    @Override
    public Geometry createGeometry() {
        return new CircleGeometry();
    }
}
