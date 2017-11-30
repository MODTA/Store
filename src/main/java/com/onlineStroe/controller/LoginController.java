package com.onlineStroe.controller;

import com.onlineStroe.enty.User;
import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.utils.CookieUtil;
import com.onlineStroe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/11/17.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    public String alterController="success";

    @RequestMapping(value="/login")
    public String preLogin(HttpServletRequest request, Model model){
        model.addAttribute("alterController",alterController);
        return "login";
    }

    //验证用户
    //登录自动跳转
    @RequestMapping(value="/dologin")
    public String login(HttpServletRequest request, HttpServletResponse response,User user,
    Model model){
        User loginUser = userService.login(user);

        if(loginUser==null){
            alterController="false";
            model.addAttribute("alterController",alterController);
            return "redirect:/login";
        }else{
            CookieUtil.setLoginUser(response,user);
            String alterController="success";
            model.addAttribute("alterController",alterController);
            return "redirect:/index";
        }
    }
}
