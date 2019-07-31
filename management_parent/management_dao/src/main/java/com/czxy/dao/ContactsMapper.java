package com.czxy.dao;

import com.czxy.domain.Contacts;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:26
 */
@org.apache.ibatis.annotations.Mapper
public interface ContactsMapper extends Mapper<Contacts> {
    @Select("select * from contacts where state=#{state} and del_status=0")
    @Results({
            @Result(property = "byProId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "pro_id"),
            @Result(property = "byCitId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "cit_id"),
            @Result(property = "byDisId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "dis_id"),
            @Result(property = "proId",column = "pro_id"),
            @Result(property = "citId",column = "cit_id"),
            @Result(property = "disId",column = "dis_id"),
    })
    List<Contacts> findContacts(@Param("state") Integer state);
}
