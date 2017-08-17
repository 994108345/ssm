package com.mb.wzl.dao;

import com.mb.wzl.entity.Jurisdiction;

/**
 * Created by wenzailong on 2017/7/3.
 */
public interface IJurisdictionDao {
    Jurisdiction selectByMenu(String menu);
}
