package com.czxy.dao;

import com.czxy.domain.Pcd;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 21:03
 */
@org.apache.ibatis.annotations.Mapper
public interface PcdMapper extends Mapper<Pcd> {

    @Select("select * from pcd where id=#{id}")
    Pcd findPcdById(@Param("id") Integer id);
}
