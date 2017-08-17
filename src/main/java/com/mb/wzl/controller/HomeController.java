package com.mb.wzl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wenzailong on 2017/6/30.
 */
@Controller
@RequestMapping("home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "left")
    public String left(){
        logger.info("left页面加载成功");
        return "/home/left";
    }
    @RequestMapping(value = "top")
    public String top(){
        logger.info("top页面加载成功");
        return "/home/top";
    }
    @RequestMapping(value = "index")
    public String index(){
        logger.info("index页面加载成功");
        return "/home/index";
    }
}
