package com.wl.structure.proxy.holder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

public class CacheLoggerProxy implements InvocationHandler {
    private ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();

    private Object target;

    public CacheLoggerProxy(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(getTarget().getClass().getClassLoader(), getTarget().getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入缓存代理和日志记录。。。");
        Object cache = getCache(args);
        if (cache == null) {
            cache = method.invoke(target, args);
            putCache(cache, args);
        }
        // logger(args);
        return cache;
    }

    // 缓存的功能
    private Object getCache(Object ... args) {
        if (args == null || args.length == 0)
            return null;
        StringBuilder stringBuilder = new StringBuilder("");
        for (Object obj : args) {
            stringBuilder.append(obj.toString());
        }
        if (stringBuilder.toString().length() == 0)
            return null;
        return concurrentHashMap.get(stringBuilder.toString());
    }

    private void putCache(Object value, Object ...args) {
        if (args == null || args.length == 0)
            return;
        StringBuilder stringBuilder = new StringBuilder("");
        for (Object obj : args) {
            stringBuilder.append(obj.toString());
        }
        if (stringBuilder.toString().length() == 0)
            return;
        concurrentHashMap.put(stringBuilder.toString(), value);
    }

    // 日志功能
    private void logger(Object ...args) {
        if (args == null || args.length == 0)
            return;
        StringBuilder stringBuilder = new StringBuilder("");
        for (Object obj : args) {
            stringBuilder.append(obj.toString());
        }
        System.out.println("查询：【" + stringBuilder + "】成功");
    }
}
