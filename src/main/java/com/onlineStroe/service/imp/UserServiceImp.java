package com.onlineStroe.service.imp;

import com.onlineStroe.dao.User.UserDao;
import com.onlineStroe.enty.User;
import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.UserQueryVo;
import com.onlineStroe.service.UserService;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override

    public User login(User user) {
        //用户名校验
        if(user==null|| StringUtils.isEmpty(user.getName())||StringUtils.isEmpty(user.getPassword())){
            return null;
        }

        User dbUser =userDao.findUserByName(user.getName());
        if(dbUser==null){
            return  null;
        }
        //用户密码校验=>没有谁使用md5
        String password=user.getPassword();
        if(!(Objects.equals(password,dbUser.getPassword()))){
            return null;
        }

            return dbUser;

    }


}
