package com.czxy.service;

import com.czxy.domain.Contacts;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/29 21:08
 */
public interface UserService {
    /**
     * 注册
     * @param contacts
     */
    void addContacts(Contacts contacts);

    /**
     * 登录
     * @param contacts
     * @return
     */
    Contacts login(Contacts contacts);
    /**
     * 用户名校验
     * @param username
     * @return
     */
    Contacts usernameCheck(String username);
}
