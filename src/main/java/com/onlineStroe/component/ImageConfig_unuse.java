package com.onlineStroe.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by Administrator on 2017/12/2.
 */

public class ImageConfig_unuse {

    private final Map<String, ModuleConfig> imageModuleMap = new HashMap<String, ModuleConfig>();

    private ResourceBundle bundle;

    /**
     * 初始化存入配置文件的值
     */
    @PostConstruct
    public void init() {
        bundle = ResourceBundle.getBundle("image", Locale.SIMPLIFIED_CHINESE);
        String[] imageModules = bundle.getString("modules").split(",");
        ModuleConfig moduleConfig;
        Enumeration<String> enu = bundle.getKeys();

        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            for (String module: imageModules) {
                if (key.equals(module + ".nameKey")){
                    String moduleKey = bundle.getString(key);//DD dd
                    if (imageModuleMap.containsKey(module)) {
                        imageModuleMap.get(module).setModuleKey(moduleKey);
                    } else {
                        moduleConfig = new ModuleConfig();
                        moduleConfig.setModule(module);
                        moduleConfig.setModuleKey(moduleKey);
                        imageModuleMap.put(module, moduleConfig);
                    }
                } else if (key.matches("^" + module + ".[0-9]+$")) {
                    if (imageModuleMap.containsKey(module)) {
                        imageModuleMap.get(module).getImageSizeMap().put(Integer.valueOf(key.split("\\.")[1]), bundle.getString(key).split(":")[1]);
                    } else {
                        moduleConfig = new ModuleConfig();
                        moduleConfig.setModule(module);
                        moduleConfig.getImageSizeMap().put(Integer.valueOf(key.split("\\.")[1]), bundle.getString(key).split(":")[1]);
                        imageModuleMap.put(module, moduleConfig);
                    }
                }
            }
        }
    }

    public String getImageModuleKey(String moduleName){
        return imageModuleMap.get(moduleName).getModuleKey();
    }

    public String getDestinationBasePath(){
        return bundle.getString("destinationBasePath");
    }

    public String getDetailDestinationBasePath(){
        return bundle.getString("detailDestinationBasePath");
    }

    public String getSourceBasePath(){
        return bundle.getString("sourceBasePath");
    }

    public String getDetailSourceBasePath(){
        return bundle.getString("detailSourceBasePath");
    }

    public String getImageSize(String moduleName, Integer imageIndex) {
        return imageModuleMap.get(moduleName).getImageSizeMap().get(imageIndex);
    }

    public List<Integer> getImageIndexList(String moduleName) {
        return new ArrayList<Integer>(imageModuleMap.get(moduleName).getImageSizeMap().keySet());
    }

    public List<String> getImageSizeList(String moduleName) {
        return new ArrayList<String>(imageModuleMap.get(moduleName).getImageSizeMap().values());
    }

}

