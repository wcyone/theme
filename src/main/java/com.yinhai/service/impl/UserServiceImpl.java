package com.yinhai.service.impl;

import com.yinhai.dao.IUserDao;
import com.yinhai.entity.User;
import com.yinhai.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wcy
 * @date 2018/12/28 16:45
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
