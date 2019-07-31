package com.czxy.service.impl;

import com.czxy.dao.PositionMapper;
import com.czxy.domain.Position;
import com.czxy.service.PositionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 11:41
 */
@Service
@Transactional
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionMapper positionMapper;

    /**
     * 查询多有的职位信息
     *
     * @return
     */
    @Override
    public List<Position> findAllPosition() {
        //通过selectAll获取所有的职位信息
        List<Position> list = positionMapper.selectAll();
        return list;
    }
}
