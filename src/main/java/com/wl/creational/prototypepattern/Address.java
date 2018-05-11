package com.wl.creational.prototypepattern;

import java.io.Serializable;

public class Address implements Serializable, Cloneable {
    private String address;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
