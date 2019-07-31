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


    /**
     * 查看手机号码
     * @param id
     * @return
     */
    Contacts findContactsById(Integer id);

    /**
     * 修改联系人删除状态 del_status=1 删除
     * @param id
     * @return
     */
    void setContactsById(Integer id);

    /**
     * 完善信息
     * @param contacts
     */
    void setContacts(Contacts contacts);

}
