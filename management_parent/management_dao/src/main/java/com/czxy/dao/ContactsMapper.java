package com.czxy.dao;

import com.czxy.domain.Contacts;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:26
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface ContactsMapper extends Mapper<Contacts> {
    /**
     * 查询所有联系人
     * @param state  0学生 1老师
     * @return
     */
    @Select("select * from contacts where state=#{state} and del_status=0")
    @Results({
            @Result(property = "byProId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "pro_id"),
            @Result(property = "byCitId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "cit_id"),
            @Result(property = "byDisId",one = @One(select = "com.czxy.dao.PcdMapper.findPcdById"),column = "dis_id"),
            @Result(property = "position",one = @One(select = "com.czxy.dao.PositionMapper.selectByPrimaryKey"),column = "pid"),
            @Result(property = "proId",column = "pro_id"),
            @Result(property = "citId",column = "cit_id"),
            @Result(property = "disId",column = "dis_id"),
    })
    List<Contacts> findContacts(@Param("state") Integer state);

    /**
     * 根据id 修改  del_status 状态 等于 1
     * @param id
     * @return
     */
    @Update("update contacts set del_status=1 where id=#{id}")
    void setContactsById(@Param("id")Integer id);
   @Select("select * from contacts where id!=#{id}")
    List<Contacts> findAll(int id);


}
