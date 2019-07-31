package com.czxy.service.impl;

import com.czxy.dao.PcdMapper;
import com.czxy.domain.Pcd;
import com.czxy.service.PcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.31 09:51
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PcdServiceImpl implements PcdService {

    @Autowired
    private PcdMapper pcdMapper;

    /**
     * 省
     * @return
     */
    @Override
    public List<Pcd> findP() {
        return pcdMapper.findP();
    }

    /**
     * 市区
     * @return
     */
    @Override
    public List<Pcd> findCD(Integer id) {
        return pcdMapper.findCD(id);
    }
}
