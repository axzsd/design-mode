package com.wl.creational.prototypepattern;

import java.io.*;

public class Customer implements Serializable, Cloneable {
    private Address address;

    /**
     * 说明：浅克隆
     * */
    public Customer shadowClone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return Customer.class.cast(clone);
    }

    /**
     * 说明：深克隆
     * */
    public Customer deepClone() {
        Customer clone = null;
        try {
            clone = Customer.class.cast(super.clone());
            clone.setAddress(Address.class.cast(this.address.clone()));
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return clone;
    }

    /**
     * 说明：序列化深克隆
     * */
    public Customer deepSerializableClone() {
        Customer clone = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            clone = Customer.class.cast(objectInputStream.readObject());
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null)
                    objectOutputStream.close();
                if (objectInputStream != null)
                    objectInputStream.close();
            } catch (IOException e) {}
        }
        return clone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
