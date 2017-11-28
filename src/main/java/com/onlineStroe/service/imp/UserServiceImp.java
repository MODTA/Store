package com.onlineStroe.service.imp;

import com.onlineStroe.dao.User.UserDao;
import com.onlineStroe.enty.User;
import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.UserQueryVo;
import com.onlineStroe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserCustom findUserById(UserQueryVo userQueryVo){
        return userDao.findUserById(userQueryVo);
    }

    @Override
    public List<UserCustom> findAll()  {
        return userDao.findAll();
    }

    @Override
    public void InsertUser(User user)  {
         userDao.insertUser(user);
    }

}
