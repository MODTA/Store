package com.onlineStroe.service;

import com.onlineStroe.enty.ImageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/1.
 */
@Service
public interface ImageService {
    /**
     * 保存图片信息
     * @param image	图片信息
     * @return	图片ID
     */
    public void addImage(ImageInfo image);

    /**
     * 更新图片
     * @param image
     * @return
     */
    public void updateImage(ImageInfo image);
    /**
     * 根据ID查询图片信息
     * @param id	图片ID
     * @return	图片信息
     */
    public ImageInfo getImageById(Integer id);
}
