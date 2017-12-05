package com.onlineStroe.Interceptor;

import com.onlineStroe.Utils.StringUtil;
import com.onlineStroe.enty.utils.BaseHelper;
import com.onlineStroe.enty.utils.SpringApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/12/4.
 */
public class HelperIntercepor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        this.injectHelper(modelAndView, o);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    private void injectHelper(ModelAndView modelAndView, Object object) {
        if (null == modelAndView || null == modelAndView.getModel() || (!(object instanceof HandlerMethod))) {
            return;
        }

        HandlerMethod handlerMethod = (HandlerMethod) object;
        String simpleClassName = handlerMethod.getBeanType().getSimpleName();
        String controllerName = StringUtil.convertFirstChar2LowerCase(simpleClassName.replace("Controller", ""));
        String actionName = handlerMethod.getMethod().getName();

        String helperBeanId = controllerName + "Helper";
        modelAndView.getModel().put("controller", controllerName);
        modelAndView.getModel().put("action", actionName);

        if (modelAndView.getViewName().startsWith("redirect:")) {
            modelAndView.getModel().clear();
        }

        BaseHelper helper = null;
        try {
            helper = SpringApplicationContext.getBean(helperBeanId);
        } catch (Exception e) {
            //防御性容错
            helper = SpringApplicationContext.getBean("baseSiteHelper");
        }

        if (null != helper) {
            modelAndView.getModel().put("helper", helper);
        }
    }
}
