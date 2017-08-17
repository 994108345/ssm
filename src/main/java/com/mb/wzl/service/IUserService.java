package com.mb.wzl.service;

import com.mb.wzl.entity.User;

/**
 * Created by wenzailong on 2017/6/29.
 */
public interface IUserService {
    public User selectUser(String userId);
    public User login(String username,String password);
}
