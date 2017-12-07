package com.onlineStroe.component;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/2.
 */
public class ModuleConfig {
    private String module;

    private String moduleKey;

    private Map<Integer, String> imageSizeMap = new HashMap<Integer, String>();

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModuleKey() {
        return moduleKey;
    }

    public void setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey;
    }

    public Map<Integer, String> getImageSizeMap() {
        return imageSizeMap;
    }

    public void setImageSizeMap(Map<Integer, String> imageSizeMap) {
        this.imageSizeMap = imageSizeMap;
    }
}
