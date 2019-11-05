package com.hardes.dao;

import com.hardes.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 */
public class TestUserDaoImpl {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserByIdTest() throws Exception {
        UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
        User user = userDao.findUserById(2);
        System.out.println(user);
    }
}