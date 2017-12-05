package com.onlineStroe.enty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/11/21.
 */
public class DealCategory implements Serializable{
    private Integer Id;
    private Integer parentID;
    private String name;
    private String urlName;
    private String publishStatue;
    private Integer orderNum;
    private Integer deep;


    private List<DealCategory> children;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getPublishStatue() {
        return publishStatue;
    }

    public void setPublishStatue(String publishStatue) {
        this.publishStatue = publishStatue;
    }


    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public List<DealCategory> getChildren() {
        return children;
    }

    public void setChildren(List<DealCategory> children) {
        this.children = children;
    }

    public List<Integer> getSelfAndChildrenIds(){
        List<Integer> ids=new ArrayList<>();
        ids.add(this.getId());
        if (null != children && !children.isEmpty()) {
            ids.addAll(idList(children));
        }
        return ids;
    }

    public List<Integer> idList(List<DealCategory> entities){
        return entities.stream().map(entity -> entity.getId())
                .collect(Collectors.toList());
    }
}
