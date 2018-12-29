package com.yinhai.service;

import com.yinhai.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author wcy
 * @date 2018/12/28 16:44
 * @Description:
 */
public interface IUserService {
    public User selectUser(long userId);
}
