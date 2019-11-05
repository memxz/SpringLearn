package com.hardes.dao;



import com.hardes.mapper.UserMapper;
import com.hardes.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 */
public class TestUserMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserByIdTest() throws Exception {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(2);
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void findUserByNameTest() throws Exception {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.findUserByName("sun liu");
        sqlSession.close();
        System.out.println(list);
    }
}