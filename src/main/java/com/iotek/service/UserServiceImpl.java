package com.iotek.service;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 11929 on 2018/12/21.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public User getUser(User user) {
        return userDao.getUser(user);
    }
}
