package com.mb.wzl.service;

import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.PageBeanAllEntity;

import java.util.List;

/**
 * Created by wenzailong on 2017/7/13.
 */
public interface IPageBeanService {
    int selectAllCount(PageBean pageBean);
    List<PageBeanAllEntity> selectCurrentCountByTableName(PageBean pageBean);
}
