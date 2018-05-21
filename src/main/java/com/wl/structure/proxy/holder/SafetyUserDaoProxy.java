package com.wl.structure.proxy.holder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SafetyUserDaoProxy implements InvocationHandler {

    private Object target;

    public SafetyUserDaoProxy(Object target) {
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
        System.out.println("正在进行查询安全检查...");
        Object invoke = null;
        if (check(method, args)) {
            invoke = method.invoke(target, args);
        }
        return invoke;
    }

    private boolean check(Method method, Object ... args) {
        if (method.getName().equals("findUserById")) {
            if (args.length != 0 && args[0] instanceof String && args[0].toString().length() > 0)
                return true;
        }
        return false;
    }
}
