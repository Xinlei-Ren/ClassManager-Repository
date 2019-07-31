package com.czxy.service.impl;

import com.czxy.dao.ContactsMapper;
import com.czxy.domain.Contacts;
import com.czxy.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ContactsServiceImpl implements ContactsService {

    /*联系人映射器*/
    @Autowired
    private ContactsMapper contactsMapper;

    /**
     * 查询所有联系人
     * @param state  0学生 1老师
     * @return
     */
    @Override
    public List<Contacts> findContacts(Integer state) {
        return contactsMapper.findContacts(state);
    }

    /**
     * 查看手机号码
     * @param id
     * @return
     */
    @Override
    public Contacts findContactsById(Integer id) {
        return contactsMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改联系人删除状态
     * @param id
     * @return
     */
    @Override
    public void setContactsById(Integer id) {
        contactsMapper.setContactsById(id);
    }
}
