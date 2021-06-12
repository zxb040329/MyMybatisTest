package com.lg.dao;

import com.lg.entity.User;

import java.util.List;

/**
 * @author zxb
 * @date 2021-05-10 23:08
 **/
public interface IUserDao {
    User getUserById(User user);

    List<User> getUserList();


}
