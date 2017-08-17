package com.mb.wzl.service.impl;

import com.mb.wzl.dao.IUserDao;
import com.mb.wzl.entity.User;
import com.mb.wzl.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by wenzailong on 2017/6/29.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    IUserDao userDao;
    @Override
    public User selectUser(String userId) {
        return userDao.selectUser(userId);
    }

    @Override
    public User login(String username, String password) {
        return userDao.selectUserByUsername(username,password);
    }
}
