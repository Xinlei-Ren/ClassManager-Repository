package com.czxy.dao;

import com.czxy.domain.Chat;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/31
 */
@org.apache.ibatis.annotations.Mapper
    public interface ChatMapper extends Mapper<Chat> {

    @Select("select distinct(received_id) from chat where id = #{id}")
    public List<Chat> findLogin(int id);


    @Select("select max(`current_date`) into @id from chat where id = #{id} and received_id = #{receivedId}")
    void id(@Param("id") int id, @Param("receivedId") int receivedId);
    @Select("select max(`current_date`) into @received_id from chat where received_id = #{id} and id = #{receivedId}")
    void receivedId(@Param("id") int id, @Param("receivedId") int receivedId);

    @Select("select *\n" +
            "from chat\n" +
            "where `current_date` = (select case  when @id>@received_id then @id\n" +
            "              when @id<@received_id then @received_id\n" +
            "               when @id is null then@received_id\n" +
            "               when @received_id is null then@id\n" +
            "              end)")
    public Chat findEnd(@Param("id") int id, @Param("receivedId") int receivedId);
@Select("select * from chat where id=#{id} and received_id=#{receivedId} or (id=#{receivedId} and received_id=#{id}) order by `current_date` ")
    List<Chat> findALll(@Param("id") int id, @Param("receivedId") Integer receivedId);
}
