package com.wl.structure.proxy;

import com.wl.structure.proxy.dao.UserDao;
import com.wl.structure.proxy.dao.impl.UserDaoImpl;
import com.wl.structure.proxy.holder.CacheLoggerProxy;
import com.wl.structure.proxy.holder.SafetyUserDaoProxy;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        // 缓存与日志代理
        CacheLoggerProxy cacheLoggerProxy = new CacheLoggerProxy(new UserDaoImpl());
        UserDao proxy = (UserDao)cacheLoggerProxy.getProxy();

        // 安全检查代理
        SafetyUserDaoProxy userDaoProxy = new SafetyUserDaoProxy(proxy);
        proxy = (UserDao) userDaoProxy.getProxy();

        System.out.println(proxy.findUserById("123"));
    }
}