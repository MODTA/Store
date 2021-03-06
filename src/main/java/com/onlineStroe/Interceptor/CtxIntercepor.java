package com.onlineStroe.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/12/4.
 */
public class CtxIntercepor implements HandlerInterceptor {
    public static final String CONTEXT_NAME = "ctx";
    public static final String SCHEME_SUFFIX = "://";
    public static final String MAOHAO = ":";


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null || modelAndView.getModel() == null) {
            return;
        }
        StringBuilder ctx = new StringBuilder();
        ctx.append("http://localhost:8080");
/*        ctx.append(httpServletRequest.getScheme());
        ctx.append(SCHEME_SUFFIX);
        ctx.append(httpServletRequest.getServerPort());


        ctx.append(httpServletRequest.getContextPath());*/
        modelAndView.getModel().put(CONTEXT_NAME, ctx.toString());

        if (modelAndView.getViewName().startsWith("redirect:")) {
            modelAndView.getModel().clear();
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
