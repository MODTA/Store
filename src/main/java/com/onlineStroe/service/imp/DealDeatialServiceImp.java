package com.onlineStroe.service.imp;

import com.onlineStroe.dao.Deal.DealDetailDAO;
import com.onlineStroe.enty.Deal_detail;
import com.onlineStroe.service.DealDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/8.
 */
@Service
public class DealDeatialServiceImp implements DealDetailService{
    @Autowired
    DealDetailDAO dealDetailDAO;
    @Override
    public Deal_detail getDealdetail(Integer dealId) {
        return dealDetailDAO.selectDealDetailByDealId(dealId);
    }
}
