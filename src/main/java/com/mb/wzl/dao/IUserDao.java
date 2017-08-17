package com.mb.wzl.dao;

import com.mb.wzl.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wenzailong on 2017/6/29.
 */
@Transactional
public interface IUserDao {
    User selectUser(String id);
    /*如果mybatis要传入多个参数，方法之一如下使用@Param注释进行配置*/
    User selectUserByUsername(@Param("username") String username,@Param("password")  String password);

    /*---------测试多参中，List加普通参数*/
    List  testMoreParams(@Param("list") List list, @Param("userName") String userName);
}
