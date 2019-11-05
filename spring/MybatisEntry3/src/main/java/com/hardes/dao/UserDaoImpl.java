package com.hardes.dao;

import com.hardes.po.User;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("user.findUserById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public void insertUser(User user) throws Exception {

    }

    @Override
    public void deleteUser(int id) throws Exception {

    }
}