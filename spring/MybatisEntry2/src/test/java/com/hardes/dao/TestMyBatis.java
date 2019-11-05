package com.hardes.dao;


import com.hardes.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;


/**
 * Created by
 */
public class TestMyBatis {

    /**
     * 非自增主键的返回 测试
     */
    @Test
    public void insertUserTest2() {
        System.out.println("--添加操作  非自增主键的返回 测试--");
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = new User();
        user.setUsername("1sun liu");
        user.setBirthday(new Date());
        user.setSex("F");
        user.setAddress("guang zhou");
        sqlSession.insert("user.insertUser2", user);
        sqlSession.commit();
        MyBatisUtil.closeSession(sqlSession);
        System.out.println(user.getId());
    }

    /**
     * 查询操作
     */

    @Test
    public void findUserByIdTest() {
        System.out.println("--根据用户ID查询对应的用户记录 测试--");
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = sqlSession.selectOne("user.findUserById", 1);
        System.out.println(user);
        MyBatisUtil.closeSession(sqlSession);
    }

    /**
     * 删除操作
     */
    @Test
    public void deleteUserTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        sqlSession.delete("user.deleteUser", "5");
        sqlSession.commit();
        MyBatisUtil.closeSession(sqlSession);
    }

    /**
     * 更新操作
     */
    @Test
    public void updateUserTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = new User();
        user.setId("2");
        user.setUsername("新用户");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("新地址");
        sqlSession.update("user.updateUser", user);
        sqlSession.commit();
        MyBatisUtil.closeSession(sqlSession);
    }
    @Test
    public void updateUserBySexTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = new User();
        user.setId("5");
        user.setUsername("liu san");
        user.setSex("F");
        user.setBirthday(new Date());
        user.setAddress("新地址23333");
        sqlSession.update("user.updateUserBySex", user);
        sqlSession.commit();
        MyBatisUtil.closeSession(sqlSession);
    }
}