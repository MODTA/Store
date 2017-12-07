package com.onlineStroe.component;

import com.onlineStroe.Utils.ImageUtil;
import com.onlineStroe.Utils.StringUtil;
import com.onlineStroe.enty.utils.BaseHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/4.
 */

public class FrontendBaseHelper extends BaseHelper{
//查找imgid对应的图片路径
    private static final String SITE_IMAGE_DOMAIN_NAME="G:\\Study\\Store\\imageLocation\\";

    public String getDefaultBlankImageUrl(){
        return SITE_IMAGE_DOMAIN_NAME + "/images/blank.jpg";
    }
//*


/*
    protected String getObjectImageUrl(String objectClass, Integer imageId, int imageIndex) {
        if (StringUtil.isEmpty(objectClass) || (imageId == null) || (imageId == 0)) {
            return getDefaultBlankImageUrl();
        }
        String imageUrl = ImageUtil.getImageUrl(
                SITE_IMAGE_DOMAIN_NAME + "/images/", imageId, objectClass, imageIndex);
        if (imageUrl == null) {
            return getDefaultBlankImageUrl();
        }
        return imageUrl;
    }
    //获取静态图片的url
    public String getStaticImageUrl(String uri) {
        if (StringUtils.isEmpty(uri)) {
            return getDefaultBlankImageUrl();
        }
        else{
            return SITE_IMAGE_DOMAIN_NAME + uri;
        }
    }
*/

}
