package com.wl.creational.singletonpattern;

/**
 * 说明：resource manage是一个资源管理器，他只能是单独存在的
 * */
public class ResourceManage {
    private ResourceManage() {}

    // 双重检查保证多线程安全
    private static ResourceManage resourceManage = null;

    // 多线程调用该方法 100 次用时 64 ms
    public static ResourceManage getInstance() {
        if (resourceManage == null) {
            synchronized (ResourceManage.class) {
                if (resourceManage == null)
                    resourceManage = new ResourceManage();
            }
        }
        return resourceManage;
    }

    // 方法二、静态类初始化
    private static class Init {
        private static final ResourceManage resourceManage = new ResourceManage();
    }

    // 多线程调用该方法 100 次用时 14 ms
    public static ResourceManage getInstanceTwo() {
        return Init.resourceManage;
    }

    // cup 核心数量
    private int Processors = Runtime.getRuntime().availableProcessors();
    // 返回 Java 虚拟机试图使用的最大内存量。
    private long maxMemory = Runtime.getRuntime().maxMemory();
    // 可以内存
    private long freeMemory = Runtime.getRuntime().freeMemory();

    private long totalMemory = Runtime.getRuntime().totalMemory();

    public int getProcessors() {
        return Processors;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    @Override
    public String toString() {
        return "ResourceManage{" +
                "Processors=" + Processors +
                ", maxMemory=" + maxMemory +
                ", freeMemory=" + freeMemory +
                ", totalMemory=" + totalMemory +
                '}';
    }
}
