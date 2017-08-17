package com.mb.wzl.controller;

import com.google.gson.Gson;
import com.mb.wzl.entity.PageBean;
import com.mb.wzl.entity.Role;
import com.mb.wzl.service.IRoleJurisdictionService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzailong on 2017/7/3.
 */
@Controller
@RequestMapping("jurisdiction")
public class RoleJurisdictionController extends BaseController{
    /*创建日志对象*/
    private Logger logger= LoggerFactory.getLogger(RoleJurisdictionController.class);
    @Resource
    IRoleJurisdictionService roleJurisdictionService;

    /**
     * 添加角色
     * @param roleName
     * @return
     */
    @RequestMapping("addRole")
    public String addRole(@RequestParam("roleName")String roleName){
        System.out.println("..............................................."+roleName);
        String user=getRequest().getParameter("user");
        String log=getRequest().getParameter("log");
        String account=getRequest().getParameter("account");
        String jurisdiction=getRequest().getParameter("jurisdiction");
        List list=new ArrayList<String>();
        if(null!=user&&!"".equals(user)){
            list.add("用户信息管理");
        }
        if(null!=log&&!"".equals(log)){
            list.add("日志信息管理");
        }
        if(null!=account&&!"".equals(account)){
            list.add("账号管理");
        }
        if(null!=jurisdiction&&!"".equals(jurisdiction)){
            list.add("权限管理");
        }
        try{
            roleJurisdictionService.addRole(roleName,list);
            logger.info("RoleJurisdictionController_addRole_error");
        }catch (Exception e){
            logger.info("RoleJurisdictionController_addRole_success");
            e.printStackTrace();
        }
        return "/base/success";
    }

    /**
     * 实验springMvc是spring（暂时失败）
     * @param roleName
     * @return
     * @throws IOException
     */
    @RequestMapping(value="validation",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String validationRole(@RequestBody String roleName) throws IOException {
        Role role=roleJurisdictionService.selectByRoleName(roleName);
        String errorMessage="";
        if(null!=role&&!"".equals(role)){
            errorMessage="角色名重复";
        }
        return errorMessage;
    }

    /**
     * 获取当页数据
     * @return
     */
    @RequestMapping("getCurrentCount")
    public String getCurrentCount(){
        /*获取当前页码*/
        String currentPage=getRequest().getParameter("currentPage");
        /*若是第一次，则本页页码为空，需要赋值为1*/
        if( null==currentPage){
            currentPage="1";
        }
        PageBean pageBean=new PageBean();
        pageBean.setCurrentPage(Integer.parseInt(currentPage));
        pageBean.setTableName("ROLE");
        /*获取总记录数*/
        int allCountNum=roleJurisdictionService.allCount(pageBean);
        pageBean.setAllCountNum(allCountNum);

        /*获取总页数*/
        pageBean.setAllPageNum(pageBean.getAllPageNum());

        /*获取第一条记录*/
        pageBean.setFirstCountNum(pageBean.getFirstCountNum());

        /*获取本页记录*/
        List currentCountList=roleJurisdictionService.selectCurrentCount(pageBean);
        pageBean.setList(currentCountList);
        getSession().setAttribute("pageBean",pageBean);

        return "/jurisdiction/modify-jurisdiction";
    }
}
