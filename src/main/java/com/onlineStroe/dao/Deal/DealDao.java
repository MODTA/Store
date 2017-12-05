package com.onlineStroe.dao.Deal;

import com.onlineStroe.enty.Deal;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
public interface DealDao {

    public List<Deal> selectDealsOfCategories(List<Integer> categoryIds);
}
