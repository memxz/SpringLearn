package com.hardes.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 */
public class MyBatisUtil {
    private final static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static void closeSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}