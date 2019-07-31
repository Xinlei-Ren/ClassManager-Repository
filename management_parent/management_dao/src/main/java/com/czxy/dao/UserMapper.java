package com.czxy.dao;

import com.czxy.domain.Contacts;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/29 21:11
 */

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<Contacts> {
    /**
     * 校验用户名和密码是否相同
     * @param contacts
     * @return
     */
    @Select("select * from contacts where user_name=#{userName} and password=#{password}")
    Contacts login(Contacts contacts);
    /**
     * 用户名校验
     * @param username
     * @return
     */
    @Select("select * from contacts where user_name=#{username}")
    Contacts usernameCheck(@Param("username") String username);

}
