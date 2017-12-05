package com.onlineStroe.enty.utils;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BaseHelper {
    //生成选项功能
    public String generateOptionsForSelect(String[][] options, String defaultValue) {
        StringBuffer sb = new StringBuffer(options.length * 35);
        for (String[] option : options) {
            sb.append("<option value=\"").append(option[0]).append("\"");
            if ((null != defaultValue) && (defaultValue.equals(option[0]))) {
                sb.append(" selected");
            }
            sb.append(">").append(option[1]).append("</option>");
        }
        return sb.toString();
    }
}
