package com.onlineStroe.controller;

import com.onlineStroe.enty.Deal;
import com.onlineStroe.enty.DealCategory;
import com.onlineStroe.service.DealCategoryService;
import com.onlineStroe.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
@Controller
public class ProductController {
    //分类分页商品
    //商品详情操作
    @Autowired
    DealCategoryService dealCategoryService;
    @Autowired
    DealService dealService;
    //getbyUrlName
    //Deal内容

    @RequestMapping(value="/products/{urlName}", method = RequestMethod.GET)
    public String listlistDealsByCategory(@PathVariable("urlName") String urlName, Model model, HttpServletRequest request){
        DealCategory dealCategory = dealCategoryService.selectByUrlName(urlName);
        model.addAttribute("dealCategory", dealCategory);
        List<Deal> dealList=dealService.getDealsOfCategories(dealCategory.getSelfAndChildrenIds());
        model.addAttribute("dealList", dealList);

        return "/products";
    }

//----------------------------测试使用
    @RequestMapping(value="try2/{urlName}", method = RequestMethod.GET)
    //上传了商品信息
    public String try2(@PathVariable("urlName") String urlName, Model model, HttpServletRequest request){
        DealCategory dealCategory = dealCategoryService.selectByUrlName(urlName);
        model.addAttribute("dealCategory", dealCategory);
        List<Deal> dealList=dealService.getDealsOfCategories(dealCategory.getSelfAndChildrenIds());
        model.addAttribute("dealList", dealList);

        return "/try2";
    }

    @RequestMapping(value="/try2", method = RequestMethod.GET)
    public String try2(Model model){
        List<Integer> try1= new ArrayList<Integer>();
        try1.add(11);
        List<Deal> dealList=dealService.getDealsOfCategories(try1);
        model.addAttribute("dealList", dealList);

        return "/try2";
    }
}
