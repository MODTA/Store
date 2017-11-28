package com.onlineStroe.controller;

import com.onlineStroe.enty.User;
import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.UserQueryVo;
import com.onlineStroe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/11/27.
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value=" ")
    public ModelAndView DisplayView(){
        ModelAndView m = new ModelAndView("register");
        return m;
    }

    @RequestMapping(value="/insertUser",method=RequestMethod.GET )
    public String RegisterMain(Model model, User user){
        userService.InsertUser(user);
        return "register";
    }
}
