package com.pie.mybatis;

import com.pie.mybatis.entity.User;
import com.pie.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class UserMapperTest {
    public static void main(String[] args) {
        InputStream is = RolesMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = ssf.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByUserId(1);
        System.out.println(user);
    }
}
