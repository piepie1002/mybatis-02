package com.pie.mybatis.mapper;

import com.pie.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author LIN
 * @since JDK 1.8
 */
public interface UserMapper {
    User selectByUserId(@Param("uId") int uId);
    
}
