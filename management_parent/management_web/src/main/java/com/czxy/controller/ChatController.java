package com.czxy.controller;

import com.czxy.domain.Chat;
import com.czxy.domain.Contacts;
import com.czxy.domain.ContactsVo;
import com.czxy.service.ContactsService;
import com.czxy.service.impl.ChatService;
import com.czxy.service.impl.ContactsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/31
 */
@RequestMapping("chat")
@RestController
public class ChatController {

    @Autowired
    private ChatService service;

    @Autowired
    private ContactsServiceImpl contactsService;

    /**
     * 获取指定人的历史信息
     *
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<ContactsVo> findAl(@PathVariable int id, HttpServletRequest request) {
        // 通过session获取登录对象
        Contacts list = (Contacts) request.getSession().getAttribute("contacts");
        //   根据当前登录的用户和传递过来的id 得到一个中建表id
        List<Chat> list1 = service.findALll(id, list.getId());
        // 创建泡脚
        ContactsVo contacts = new ContactsVo();
        // 赋值 返回
        contacts.setContactsShow(contactsService.findById(id));
        contacts.setChatList(list1);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    /**
     * 向中见表添加数据
     *
     * @param content
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/addChat/{content}/{id}")
    public ResponseEntity<Void> addChat(@PathVariable String content, @PathVariable int id, HttpServletRequest request) {
        //  获取当前登录的对象
        Contacts list = (Contacts) request.getSession().getAttribute("contacts");
        // 创建中间表的对象
        Chat chat = new Chat();
        // 复制发送过来的id
        chat.setContent(content);
        // 发送人的id
        chat.setId(list.getId());
        // 当前时间
        chat.setCurrentDate(new Date());
        // 发给谁的id
        chat.setReceivedId(id);
        // 调用添加方法
        contactsService.addChat(chat);
        // 返回成功状态码
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**\
     * 获取和谁聊天
     * @param id
     * @return
     */
    @GetMapping("findByid/{id}")
    public ResponseEntity<Contacts> findById(@PathVariable int id) {
        Contacts byId = contactsService.findById(id);
        return new ResponseEntity<>(byId, HttpStatus.OK);
    }
}

