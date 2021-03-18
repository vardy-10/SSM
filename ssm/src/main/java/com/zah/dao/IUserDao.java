package com.zah.dao;

import com.zah.model.User;

public interface IUserDao {

    User selectUser(long id);
}