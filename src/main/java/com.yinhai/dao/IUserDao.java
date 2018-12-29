package com.yinhai.dao;


import com.yinhai.entity.User;

/**
 * @author wcy
 * @date 2018/12/28 16:43
 * @Description:
 */
public interface IUserDao {
    User selectUser(long id);

    User updateUser(User user);
}
