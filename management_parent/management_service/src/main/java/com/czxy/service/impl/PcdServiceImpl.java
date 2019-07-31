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

    /*城市映射器*/
    @Autowired
    private PcdMapper pcdMapper;

    /**
     * 查询所有省份信息
     * @return
     */
    @Override
    public List<Pcd> findP() {
        return pcdMapper.findP();
    }

    /**
     * 根据id查询市，区信息
     * @param id
     * @return
     */
    @Override
    public List<Pcd> findCD(Integer id) {
        return pcdMapper.findCD(id);
    }
}
