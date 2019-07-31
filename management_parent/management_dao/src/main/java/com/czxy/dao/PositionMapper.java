package com.czxy.dao;

import com.czxy.domain.Position;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 11:37
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface PositionMapper extends Mapper<Position> {

}
