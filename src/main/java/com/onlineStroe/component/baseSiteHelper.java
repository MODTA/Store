package com.onlineStroe.component;

import com.onlineStroe.Utils.DealConstant;
import com.onlineStroe.enty.Deal;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/4.
 */
@Component
public class baseSiteHelper extends FrontendBaseHelper{

    public String getDealImageUrlForDealList(Deal deal) {
        return getObjectImageUrl(DealConstant.PICTURE_MODULE_DEAL, deal.getImage_id(),
                DealConstant.PICTURE_SIZE_BY_TYPE_LIST);
    }

}
