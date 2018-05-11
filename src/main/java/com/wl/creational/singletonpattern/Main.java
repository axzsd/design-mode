package com.wl.creational.singletonpattern;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String [] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(100);
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                ResourceManage resourceManage = ResourceManage.getInstance();
                // System.out.println(Thread.currentThread().getName() +  " resourceManage hashCode: " + resourceManage.hashCode());
                countDownLatch.countDown();
            }, "Thread-" + i).start();
        }
        countDownLatch.await();
        long e = System.currentTimeMillis();
        System.out.println("方法一：双重检查调用一百次用时：" + (e - s));

        final CountDownLatch countDownLatch2 = new CountDownLatch(100);
        s = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                ResourceManage resourceManage = ResourceManage.getInstanceTwo();
                // System.out.println(Thread.currentThread().getName() +  " resourceManage hashCode: " + resourceManage.hashCode());
                countDownLatch2.countDown();
            }, "Thread-" + i).start();
        }
        countDownLatch.await();
        e = System.currentTimeMillis();
        System.out.println("方法二：静态初始化调用一百次用时：" + (e - s));
    }
}
