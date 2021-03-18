package com.zah.service.impl;

import com.zah.dao.IUserDao;
import com.zah.model.User;
import com.zah.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
