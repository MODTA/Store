package com.onlineStroe.dao.Deal;

import com.onlineStroe.enty.Deal_detail;

/**
 * Created by Administrator on 2017/12/1.
 */
public interface DealDetailDAO {
    public Deal_detail selectDealDetailByDealId(Integer dealId);
}
