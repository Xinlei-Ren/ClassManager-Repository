package com.czxy.service.impl;

import com.czxy.dao.ChatMapper;
import com.czxy.dao.ContactsMapper;
import com.czxy.domain.Chat;
import com.czxy.domain.Contacts;
import com.czxy.domain.ContactsVo;
import com.czxy.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ContactsServiceImpl implements ContactsService {
    @Autowired
    private ChatMapper chatMapper;
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

    /**
     * 完善信息
     * @param contacts
     */
    @Override
    public void setContacts(Contacts contacts) {
        contactsMapper.updateByPrimaryKeySelective(contacts);
    }

    /**
     * 不要动
     *
     */
    public List<Contacts>findAll(int id){
        return contactsMapper.findAll(id);
    }
    /**
     * 不要动
     *
     */
    public  List<ContactsVo> findLoginid(int id){
        List<ContactsVo> contactsVos=new ArrayList<>();
        List<Chat> login = chatMapper.findLogin(id);
        for (Chat chat : login) {
            Contacts contacts = contactsMapper.selectByPrimaryKey(chat.getReceivedId());
            chatMapper.id(id,chat.getReceivedId());
            chatMapper.receivedId(id,chat.getReceivedId());
            Chat end = chatMapper.findEnd(id, chat.getReceivedId());
            ContactsVo c=new ContactsVo();
            c.setContactsShow(contacts);
            c.setChat(end);
            contactsVos.add(c);
            System.out.println(c);
        }
        return contactsVos;
    }
    /**
     * 不要动
     *
     */
    public Contacts findById(int id) {

        return contactsMapper.selectByPrimaryKey(id);
    }
    /**
     * 不要动
     *
     */
    public void addChat(Chat chat) {
        chatMapper.insert(chat);
    }

}
