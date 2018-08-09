package com.wl.structure.proxy.dao.impl;

import com.wl.structure.proxy.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public String findUserById(String userId) {
        return "UserDaoImpl--返回一个user:" + userId;
    }
}
