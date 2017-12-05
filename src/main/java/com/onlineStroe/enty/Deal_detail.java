package com.onlineStroe.enty;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/20.
 */
public class Deal_detail implements Serializable {
    private Integer id;
    private Integer deal_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(Integer deal_id) {
        this.deal_id = deal_id;
    }

    public String getDeal_detail() {
        return deal_detail;
    }

    public void setDeal_detail(String deal_detail) {
        this.deal_detail = deal_detail;
    }

    private String deal_detail;

}

