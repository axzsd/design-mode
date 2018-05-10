package com.wl.creational.simplefactorypattern.factory;

import com.wl.creational.simplefactorypattern.exception.UnSupportedShapeException;
import com.wl.creational.simplefactorypattern.framework.Geometry;
import com.wl.creational.simplefactorypattern.product.CircleGeometry;
import com.wl.creational.simplefactorypattern.product.TrigonGeometry;

public class GeometrySimpleFactory {
    public static Geometry geometryFactory(String type) {
        if ("sjx".equals(type))
            return new TrigonGeometry();
        else if ("yx".equals(type))
            return new CircleGeometry();
        throw new UnSupportedShapeException("不支持" + type);
    }
}
