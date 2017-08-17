package com.mb.wzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by wenzailong on 2017/8/14.
 */
@Controller
@RequestMapping("redirect")
public class SendRedirectController {

    @RequestMapping(value = "exit" ,method = { RequestMethod.POST, RequestMethod.GET })
    public String exit(HttpServletResponse response){
        return "redirect:/base/exit";
    }

    @RequestMapping(value = "logoff" ,method = { RequestMethod.POST, RequestMethod.GET })
    public String logoff(HttpServletResponse response){
        return "redirect:/user/login";
    }

}
