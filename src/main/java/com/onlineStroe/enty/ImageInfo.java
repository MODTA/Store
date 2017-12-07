package com.onlineStroe.enty;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/20.
 */
public class ImageInfo implements Serializable {
    private Integer width;
    private Integer height;
    private String source;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
