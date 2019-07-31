package com.czxy.service.impl;

import com.czxy.dao.UserMapper;
import com.czxy.domain.Contacts;
import com.czxy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/29 21:09
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 注册
     * @param contacts
     */
    @Override
    public void addContacts(Contacts contacts) {
        //调用userMapper保存数据
        userMapper.insert(contacts);
    }

    /**
     * 登录
     * @param contacts
     * @return
     */
    @Override
    public Contacts login(Contacts contacts) {
        return userMapper.login(contacts);
    }

    /**
     * 用户名校验
     * @param username
     * @return
     */
    @Override
    public Contacts usernameCheck(String username) {
        return userMapper.usernameCheck(username);
    }
}
