package com.onlineStroe.controller;

import com.onlineStroe.Utils.CookieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/12/8.
 */
@Controller
public class CartController {
//访问cart表提取cart信息=>userid;
    @RequestMapping(value="/cart")
    public String cart(Model model, HttpServletRequest request){
        Integer userId = CookieUtil.getUserId(request);
        return "cart";
    }
}
