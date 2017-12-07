package com.onlineStroe.dao.Image;

import com.onlineStroe.enty.ImageInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/12/5.
 */
@Repository
public interface ImageDao {
    public ImageInfo selectImageById(Integer ImageId);

    public void insertImage(ImageInfo imge);

    public void updateByPrimaryKeySelective(ImageInfo image);
}
