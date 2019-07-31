package com.czxy.service;

import com.czxy.domain.Position;

import java.util.List;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 11:41
 */
public interface PositionService {
    /**
     * 查询多有的职位信息
     * @return
     */
    List<Position> findAllPosition();
}
