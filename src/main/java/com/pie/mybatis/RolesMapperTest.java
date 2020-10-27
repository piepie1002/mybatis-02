package com.pie.mybatis;

import com.pie.mybatis.entity.Roles;
import com.pie.mybatis.mapper.RolesMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class RolesMapperTest {
    public static void main(String[] args) {
        //获取流
        InputStream is = RolesMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = ssf.openSession(true);
        RolesMapper rolesMapper = sqlSession.getMapper(RolesMapper.class);
        Roles roles = rolesMapper.selectByUserId(1);
        System.out.println(roles);
    }
}
