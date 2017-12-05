package com.onlineStroe.service;

import com.onlineStroe.enty.Deal;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
public interface DealService {

    List<Deal> getDealsOfCategories(List<Integer> categoryIds);

}
