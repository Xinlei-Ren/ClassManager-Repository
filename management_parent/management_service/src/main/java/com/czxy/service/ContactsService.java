package com.czxy.service;

import com.czxy.domain.Contacts;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:24
 */
public interface ContactsService {

    /**
     * 查询所有联系人
     * @param state 0学生 1老师
     * @return
     */
    List<Contacts> findContacts(Integer state);
}
