package com.onlineStroe.service;

import com.onlineStroe.dao.DealCategory.DealCategoryDao;
import com.onlineStroe.enty.DealCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Service
public interface DealCategoryService {


    public List<DealCategory> getCategories();

}

