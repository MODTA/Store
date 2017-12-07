package com.onlineStroe.component;

import com.onlineStroe.Utils.DealConstant;
import com.onlineStroe.enty.Deal;
import com.onlineStroe.enty.utils.ImageUrl;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/4.
 */
@Component
public class baseSiteHelper extends FrontendBaseHelper{

    public String getSingleImageUrlForDealLIst(Deal deal) {
        return ImageUrl.RELATIVEIMAGE_NORMAL+deal.getImage_id()+".jpg";
    }
    //170*170的图片大小
    public String getProductsImageUrlForDealList(Deal deal){
        return ImageUrl.RRELATIVEIMAGE_FIX+deal.getImage_id()+".jpg";
    }

}
