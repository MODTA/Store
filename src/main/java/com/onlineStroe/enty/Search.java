package com.onlineStroe.enty;

import com.onlineStroe.enty.utils.Condition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Search implements Serializable {

    private List<Condition> conditionList = new ArrayList<>();

    public boolean containsRouterCall() {
        if (null == conditionList || null == getRouterName()
                || null == getMethods()
                || null == getConfirmMethods() || null == getGridId()) {
            return false;
        }
        return true;
    }

    public String getRouterName() {
        for (Condition cond : conditionList) {
            if ("routerName".equals(cond.getName())) {
                return (String)cond.getValue();
            }
        }
        return null;
    }

    public String[] getMethods() {
        for (Condition cond : conditionList) {
            if ("methods".equals(cond.getName())) {
                return ((String)cond.getValue()).split(",");
            }
        }
        return null;
    }

    public String[] getConfirmMethods() {
        for (Condition cond : conditionList) {
            if ("confirmMethods".equals(cond.getName())) {
                return ((String)cond.getValue()).split(",");
            }
        }
        return null;
    }

    public String getGridId() {
        for (Condition cond : conditionList) {
            if ("gridId".equals(cond.getName())) {
                return (String)cond.getValue();
            }
        }
        return null;
    }

}
