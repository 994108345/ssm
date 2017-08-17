package com.mb.wzl.service.impl;

import com.mb.wzl.dao.IJurisdictionDao;
import com.mb.wzl.dao.IRoleDao;
import com.mb.wzl.dao.IRoleJurisdictionDao;
import com.mb.wzl.entity.Jurisdiction;
import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.Role;
import com.mb.wzl.entity.RoleJurisdiction;
import com.mb.wzl.service.IPageBeanService;
import com.mb.wzl.service.IRoleJurisdictionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wenzailong on 2017/7/3.
 */
@Service("roleJurisdictionService")
public class RoleJurisdictionServiceImpl implements IRoleJurisdictionService{
    @Resource
    IRoleDao roleDao;
    @Resource
    IRoleJurisdictionDao roleJurisdictionDao;
    @Resource
    IJurisdictionDao jurisdictionDao;
    @Resource
    IPageBeanService pageBeanService;
    private Logger logger= LoggerFactory.getLogger(RoleJurisdictionServiceImpl.class);
    /*--主要业务逻辑---------------------------------------------------------*/
    /*查找name是否重复*/
    @Override
    public Role selectByRoleName(String roleName) {
        return roleDao.selectByRoleName(roleName);
    }
    /*添加角色*/
    @Override
    public void addRole(String roleName, List list) {
        logger.info("开始添加新角色");
        RoleJurisdiction roleJurisdiction=new RoleJurisdiction();
        try{
            /*插入role对象*/
            int resultNum=roleDao.insertRole(roleName);
            /*查询role对应id*/
            Role role=roleDao.selectByRoleName(roleName);
            String roleId=role.getId();
            logger.info("添加角色成功,resultNum:"+resultNum);
            for(int i=0;i<list.size();i++){
                /*查询权限表，message对应的id*/
               Jurisdiction jurisdiction=jurisdictionDao.selectByMenu(list.get(i).toString());
               String jurisdictionId=jurisdiction.getId();
               /*将权限id角色id插入用户-权限表*/
               roleJurisdiction.setRoleId(roleId);
               roleJurisdiction.setJurisdictionId(jurisdictionId);
               int resultNum2=roleJurisdictionDao.insertRoleJurisdiction(roleJurisdiction);
               logger.info("角色-权限表添加记录成功，resultNum2:"+resultNum2);
            }
            logger.info("添加新角色结束");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 查询出该表的总记录数
     * @param pageBean
     * @return
     */
    @Override
    public int allCount(PageBean pageBean) {
        return pageBeanService.selectAllCount(pageBean);
    }
    /**
     * 查询出当页的记录
     * @param pageBean
     * @return
     */
    @Override
    public List selectCurrentCount(PageBean pageBean) {
        return pageBeanService.selectCurrentCountByTableName(pageBean);
    }




    /*--测试方法-------------------------------------------------------------*/
    /*
    * 根据角色名搜索role对象
    * */

    /*
    * 为角色表插入新记录
    * */
    @Override
    public int insertRole(String roleName) {
        return roleDao.insertRole(roleName);
    }
    /*
     * 为角色-权限表插入新记录
     * */
    @Override
    public int insertRoleJurisdiction(RoleJurisdiction roleJurisdiction) {
        return roleJurisdictionDao.insertRoleJurisdiction(roleJurisdiction);
    }
}
