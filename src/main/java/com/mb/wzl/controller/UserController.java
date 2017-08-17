package com.mb.wzl.controller;

import com.mb.wzl.entity.User;
import com.mb.wzl.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by wenzailong on 2017/6/30.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private IUserService userService;
    /*
    登录方法
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password, Model model){
        User user=userService.login(username,password);
        if(null!=user&&!"".equals(user)){
            getSession().setAttribute("user",user);
            logger.info("登录成功");
            return "/home/main";
        }else{
            logger.info("登录失败");
            model.addAttribute("login","登录失败");
            return "/user/login";
        }


    }
}
