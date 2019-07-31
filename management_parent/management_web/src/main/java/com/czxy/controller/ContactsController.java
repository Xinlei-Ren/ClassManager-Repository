package com.czxy.controller;
import com.czxy.domain.Contacts;
import com.czxy.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * 联系控制器
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:23
 */
@RestController
@RequestMapping("/contacts")
public class ContactsController {
    /*联系服务*/
    @Autowired
    private ContactsService contactsService;

    /**
     * 查询所有联系人
     * @param state 0学生 1老师
     * @return
     */
    @GetMapping("/showContacts")
    public ResponseEntity<List<Contacts>> showContacts(Integer state) {
        try {
            List<Contacts> contactsList = contactsService.findContacts(state);
            return new ResponseEntity<>(contactsList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 查看手机号码
     * @param id
     * @return
     */
    @GetMapping("/ViewTelephone")
    public ResponseEntity<Contacts> ViewTelephone(Integer id){
        try {
            Contacts contacts = contactsService.findContactsById(id);
            return new ResponseEntity<>(contacts,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * 修改联系人删除状态  del_status=1 删除
     * @param id
     * @return
     */
    @PutMapping("/deleteContacts")
    public ResponseEntity<String>deleteContacts(Integer id){
        try {
            contactsService.setContactsById(id);
            return new ResponseEntity<>("删除成功",HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
