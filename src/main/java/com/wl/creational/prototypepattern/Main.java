package com.wl.creational.prototypepattern;

public class Main {
    public static void main(String [] args) {
        Address address = new Address();
        address.setAddress("重庆");
        // 第一个原型
        Customer customer = new Customer();
        customer.setAddress(address);
        System.out.println("我是第一个标本对象：" + customer.getAddress().getAddress());
        System.out.println("=====================================================");
        System.out.println();

        // 浅拷贝
        Customer shadowClone = customer.shadowClone();
        System.out.println("我是第一个浅拷贝对象：" + shadowClone.getAddress().getAddress());
        System.out.println("Address == oldAddress :" + (shadowClone.getAddress() == address));
        System.out.println("=====================================================");
        System.out.println();

        // 深拷贝
        Customer deepClone = customer.deepClone();
        System.out.println("我是第一个深拷贝对象：" + deepClone.getAddress().getAddress());
        System.out.println("Address == oldAddress :" + (deepClone.getAddress() == address));
        System.out.println("=====================================================");
        System.out.println();

        Customer serializableClone = customer.deepSerializableClone();
        System.out.println("我是第二个深拷贝对象：" + serializableClone.getAddress().getAddress());
        System.out.println("Address == oldAddress :" + (serializableClone.getAddress() == address));
        System.out.println("=====================================================");
        System.out.println();
    }
}
