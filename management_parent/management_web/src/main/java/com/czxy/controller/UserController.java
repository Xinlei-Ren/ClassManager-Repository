package com.czxy.controller;

import com.czxy.domain.Contacts;
import com.czxy.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 8:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /*用户服务*/
    @Resource
    private UserService userService;

    /**
     * 用户名校验
     * @param username
     * @return
     */
    @PostMapping("/usernameCheck")
    public ResponseEntity<Boolean> usernameCheck(String username){
        try {
            Contacts contacts = userService.usernameCheck(username);
            //为null 用户名可用
            if(contacts==null){
                 return new ResponseEntity<>(true,HttpStatus.CREATED);
            }else {
                //不为null用户名已存在不可用
                return new ResponseEntity<>(false,HttpStatus.CREATED);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 注册
     * @param file
     * @param contacts
     * @return
     */
    @PostMapping("/addContacts")
    public ResponseEntity<Void> addContacts(MultipartFile file, Contacts contacts) {
        try {
            //获取图片路径
            String originalFilename = file.getOriginalFilename();
            //保存图片
            file.transferTo(new File("D:\\Config\\" + originalFilename));
            String s = "../Config/" + originalFilename;
            contacts.setSrcImg(s);
            //调用addContacts方法保存数据
            userService.addContacts(contacts);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * 登录
      * @param contacts
     * @return
     */
    @GetMapping("/login")
    public ResponseEntity<Boolean> login(Contacts contacts, HttpSession session){
        try {
            //调用login方法
            Contacts login = userService.login(contacts);
            //login 为null 登录失败
            if(login==null){
                return new ResponseEntity<>(false,HttpStatus.OK);
            }else {
                //否则登录成功 将Contacts保存到session中
                session.setAttribute("contacts",login);
                return new ResponseEntity<>(true,HttpStatus.OK);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
