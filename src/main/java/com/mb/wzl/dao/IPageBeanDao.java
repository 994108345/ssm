package com.mb.wzl.dao;

import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.PageBeanAllEntity;

import java.util.List;

/**
 * Created by wenzailong on 2017/7/13.
 */
public interface IPageBeanDao {
    /**
     * 查询该表总共有多少数据
     * @param pageBean
     * @return
     */
    int selectAllCount(PageBean pageBean);

    /**
     * 根据条件查询表当前页的数据
     * @param pageBean
     * @return
     */
    List<PageBeanAllEntity> selectCurrentCountByTableName(PageBean pageBean);

}
