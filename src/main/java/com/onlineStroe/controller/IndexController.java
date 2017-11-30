package com.onlineStroe.controller;

import com.onlineStroe.enty.DealCategory;
import com.onlineStroe.service.DealCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
@Controller
@RequestMapping(value="/index")
public class IndexController {
    @Autowired
    private DealCategoryService dealCategoryService;
    //分类
    //首页商品的显示
    @RequestMapping("")
    public String index(Model model, HttpServletRequest request){
        List<DealCategory> categories =dealCategoryService.getCategories();
        model.addAttribute("categories",categories);

        return "index";
    }

    //首页商品的显示
    @RequestMapping("/try2")
    public String try2(Model model, HttpServletRequest request){
        String try1="success";
        return "try2";
    }
}
