package com.pie.mybatis.mapper;

import com.pie.mybatis.entity.Roles;
import org.apache.ibatis.annotations.Param;

/**
 * @author LIN
 * @since JDK 1.8
 */
public interface RolesMapper {
    Roles selectById(@Param("roleId") int roleId);
    
    Roles selectByUserId(@Param("userId") int userId);
}
