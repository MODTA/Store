package com.onlineStroe.dao.Deal;

import com.onlineStroe.enty.Deal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
@Repository
public interface DealDao {

    public List<Deal> selectDealsOfCategories(List<Integer> categoryIds);

    public Deal selectDealById(Integer dealId);
}
