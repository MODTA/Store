package com.onlineStroe.controller;

import com.onlineStroe.enty.Deal;
import com.onlineStroe.enty.Deal_detail;
import com.onlineStroe.service.DealDetailService;
import com.onlineStroe.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/7.
 */
@Controller
public class DealController {
    //图片=>deal<=dealId
    @Autowired
    DealService dealService;
    @Autowired
    DealDetailService dealDetailService;

    @RequestMapping(value = "/single/{dealId}", method = RequestMethod.GET)
    public String showDeal(Model model, @PathVariable("dealId") Integer dealId) {
        Deal deal = dealService.selectDealById(dealId);
        Deal_detail deal_detail=dealDetailService.getDealdetail(dealId);
        model.addAttribute("dealDetail",deal_detail);
        model.addAttribute("deal", deal);
        return "single";
    }

    @RequestMapping(value = "/try3/{dealId}", method = RequestMethod.GET)
    public String try3(Model model, @PathVariable("dealId") Integer dealId) {
        Deal deal = dealService.selectDealById(dealId);
        Deal_detail deal_detail=dealDetailService.getDealdetail(dealId);
        model.addAttribute("dealDetail",deal_detail);
        model.addAttribute("deal", deal);
        return "try2";
    }


}
