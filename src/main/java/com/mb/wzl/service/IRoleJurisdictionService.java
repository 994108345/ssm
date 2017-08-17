package com.mb.wzl.service;

import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.Role;
import com.mb.wzl.entity.RoleJurisdiction;

import java.util.List;

/**
 * Created by wenzailong on 2017/7/3.
 */
public interface IRoleJurisdictionService {
    Role selectByRoleName(String roleName);
    int insertRole(String roleName);
    int insertRoleJurisdiction(RoleJurisdiction roleJurisdiction);
    void addRole(String roleName,List list);

    /**
     * 查询出该表的总记录数
     * @param pageBean
     * @return
     */
    int allCount(PageBean pageBean);

    /**
     * 查询出当页的记录
     * @param pageBean
     * @return
     */
    List selectCurrentCount(PageBean pageBean);
}
