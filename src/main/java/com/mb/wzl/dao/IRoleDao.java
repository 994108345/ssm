package com.mb.wzl.dao;

import com.mb.wzl.entity.Role;

/**
 * Created by wenzailong on 2017/7/3.
 */
public interface IRoleDao {
    int insertRole(String roleName);
    Role selectByRoleName(String roleName);
}
