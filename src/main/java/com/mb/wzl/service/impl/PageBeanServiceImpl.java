package com.mb.wzl.service.impl;

import com.mb.wzl.dao.IPageBeanDao;
import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.PageBeanAllEntity;
import com.mb.wzl.service.IPageBeanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wenzailong on 2017/7/13.
 */
@Service("pageBeanService")
public class PageBeanServiceImpl implements IPageBeanService{
    @Resource
    IPageBeanDao pageBeanDao;

    /**
     * 检索表的所有记录数
     * @param pageBean
     * @return
     */
    @Override
    public int selectAllCount(PageBean pageBean) {
        return pageBeanDao.selectAllCount(pageBean);
    }

    /**
     * 检索表的当前页记录
     * @param pageBean
     * @return
     */
    @Override
    public List<PageBeanAllEntity> selectCurrentCountByTableName(PageBean pageBean) {
        return pageBeanDao.selectCurrentCountByTableName(pageBean);
    }
}
