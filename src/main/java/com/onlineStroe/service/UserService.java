package com.onlineStroe.service;

import com.onlineStroe.enty.User;
import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.UserQueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface UserService {
    public UserCustom  findUserById(UserQueryVo userQueryVo);

    public List<UserCustom> findAll();

    public void InsertUser(User user);
}
