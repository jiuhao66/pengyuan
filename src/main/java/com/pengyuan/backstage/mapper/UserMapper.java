package com.pengyuan.backstage.mapper;

import com.pengyuan.backstage.bean.Orders;
import com.pengyuan.backstage.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author LX
 * @date 2019/7/7 - 15:24
 */
public interface UserMapper {

    /**
     *
     *  根据用户名和密码
     *
     * @param userName
     * @param password
     * @return
     */
    @Select("SELECT * FROM USER WHERE userName=#{userName} AND password=#{password}")
    User selByLogin(@Param("userName") String userName, @Param("password") String password);


}
