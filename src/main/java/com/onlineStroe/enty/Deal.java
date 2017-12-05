package com.onlineStroe.enty;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/14.
 */
public class Deal implements Serializable {
    private Integer id;
    private String  sku_id;
    private Integer deal_class;
    private Long image_id;
    private Integer deal_level;
    private Integer inventory_amount;
    private String merchant_id;
    private String category_id;
    private String oss_statue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public Integer getDeal_class() {
        return deal_class;
    }

    public void setDeal_class(Integer deal_class) {
        this.deal_class = deal_class;
    }

    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public Integer getDeal_level() {
        return deal_level;
    }

    public void setDeal_level(Integer deal_level) {
        this.deal_level = deal_level;
    }

    public Integer getInventory_amount() {
        return inventory_amount;
    }

    public void setInventory_amount(Integer inventory_amount) {
        this.inventory_amount = inventory_amount;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getOss_statue() {
        return oss_statue;
    }

    public void setOss_statue(String oss_statue) {
        this.oss_statue = oss_statue;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }
}
