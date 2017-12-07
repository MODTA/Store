package com.onlineStroe.service.imp;

import com.onlineStroe.dao.Image.ImageDao;
import com.onlineStroe.enty.ImageInfo;
import com.onlineStroe.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/1.
 */
@Service
public class ImageServiceImp implements ImageService{
    @Autowired
    private ImageDao imageDAO;

    /**
     * 保存图片信息
     * @param image	图片信息
     * @return	图片ID
     */
    public void addImage(ImageInfo image) {
         imageDAO.insertImage(image);
    }

    /**
     * 更新图片
     * @param image
     * @return
     */
    public void updateImage(ImageInfo image){
         imageDAO.updateByPrimaryKeySelective(image);
    }

    /**
     * 根据ID查询图片信息
     * @param id	图片ID
     * @return	图片信息
     */
    public ImageInfo getImageById(Integer id) {
        return imageDAO.selectImageById(id);
    }
}
