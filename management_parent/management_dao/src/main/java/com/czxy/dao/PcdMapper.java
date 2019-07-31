package com.czxy.dao;

import com.czxy.domain.Pcd;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 21:03
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface PcdMapper extends Mapper<Pcd> {

    /**
     * 根据id查询城市
     * @param id
     * @return
     */
    @Select("select * from pcd where id=#{id}")
    Pcd findPcdById(@Param("id") Integer id);


    /**
     * 查询所有省
     * @return
     */
    @Select("select * from pcd where pid=0")
    List<Pcd> findP();

    /**
     * 根据pid查询城市
     * @param id
     * @return
     */
    @Select("select * from pcd where pid=#{id}")
    List<Pcd> findCD(@Param("id")Integer id);
}
