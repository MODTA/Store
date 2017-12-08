package com.onlineStroe.Utils;

import com.onlineStroe.enty.User;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * Created by Administrator on 2017/11/29.
 */
public class CookieUtil {

    public static final int MAX_AGE = 60 * 30;

    public static final String USER_LOGIN_NAME = "ui";

    public static void setLoginUser(HttpServletResponse response, User user) {
        if (response == null || user == null) {
            return;
        }
        Integer userId = user.getId();
        String userName = user.getName();
        StringBuilder cookieValue = new StringBuilder();

        cookieValue.append(userId).append("|").append(userName);
        addCookie(response, USER_LOGIN_NAME, cookieValue.toString());
    }

    public static void addCookie(HttpServletResponse response, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(MAX_AGE);
        response.addCookie(cookie);

    }
    //getcookie

    public static Integer getUserId(HttpServletRequest request){
        if(request==null){
            return null;
        }
        String value=getCookieValue(USER_LOGIN_NAME,request);
        if(value==null){
            return null;
        }

        String [] array=value.split("|");
        Integer userId=new Integer(Integer.parseInt(array[0]));
        return userId;
    }

    public static String getCookieValue(String name, HttpServletRequest request) {
        if (null == request || StringUtils.isEmpty(name)) {
            return null;
        }

        Cookie[] cookies = request.getCookies();
        if (null == cookies || 0 == cookies.length) {
            return null;
        }

        for (Cookie cookie : cookies) {
            if (Objects.equals(cookie.getName(), name)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}

