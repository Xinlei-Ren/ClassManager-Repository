package com.czxy.service.impl;

import com.czxy.service.ContactsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ContactsServiceImpl implements ContactsService {

}
