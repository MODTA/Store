package com.onlineStroe.service.imp;

import com.onlineStroe.dao.Deal.DealDao;
import com.onlineStroe.dao.Deal.DealDetailDAO;
import com.onlineStroe.enty.Deal;
import com.onlineStroe.service.DealCategoryService;
import com.onlineStroe.service.DealService;
import com.onlineStroe.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
public class DealServiceImp implements DealService {

    @Autowired
    DealDao dealDao;
    @Autowired
    DealDetailDAO dealDetailDAO;
    @Autowired
    DealCategoryService dealCategoryService;
    @Autowired
    ImageService imageService;


    @Override
    public List<Deal> getDealsOfCategories(List<Integer> categoryIds) {
        return dealDao.selectDealsOfCategories(categoryIds);
    }
}
