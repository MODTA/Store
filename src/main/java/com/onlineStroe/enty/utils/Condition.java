package com.onlineStroe.enty.utils;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/5.
 */

public class Condition implements Serializable {

    private String name;
    private Object value;


    public Condition(){
    }
    public Condition(String name){
        this.name =name;
    }
    public Condition(String name,String value){
        this.name =name;
        this.value=value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
