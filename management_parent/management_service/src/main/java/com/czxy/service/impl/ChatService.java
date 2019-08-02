package com.czxy.service.impl;

import com.czxy.dao.ChatMapper;
import com.czxy.domain.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/31
 */
@Service
public class ChatService {
    @Autowired
    private ChatMapper chatMapper;
    /**
     * 不要动
     *
     */
    public List<Chat> findALll(int id, Integer id1) {
        return chatMapper.findALll(id,id1);
    }
}
