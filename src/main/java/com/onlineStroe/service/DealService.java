package com.onlineStroe.service;

import com.onlineStroe.enty.Deal;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Service
public interface DealService {

    List<Deal> getDealsOfCategories(List<Integer> categoryIds);

}
