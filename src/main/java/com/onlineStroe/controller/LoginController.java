package com.onlineStroe.controller;

import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/11/17.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/findAllUser")
    public @ResponseBody
    ModelAndView try1()throws Exception{
     ModelAndView m =new ModelAndView();

        List<UserCustom>  userCustoms=userService.findAll();
        m.addObject("userCustoms",userCustoms);
        m.setViewName("try1");
        return m;
    }

    //验证用户
    //登录自动跳转

}
