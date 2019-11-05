package com.hardes.model;


import com.hardes.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class UserTest {

    SqlSession sqlSession ;
    @Test
    public void insertPerson(){
        sqlSession = MybatisUtil.getSqlSession();
        int id = 112;
        String userName = "jack wang";
        int age = 28;
        String mobilePhone = "3348";
        Person person = new Person();
        person.setId(id);
        person.setAge(age);
        person.setUserName(userName);
        person.setMobilePhone(mobilePhone);
        try{
            sqlSession.insert("insertPerson",person);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    public void queryById(){
        sqlSession = MybatisUtil.getSqlSession();
        int id = 1;
        try{
            Person person = sqlSession.selectOne("queryById",id);

            sqlSession.commit();
            System.out.println(person.getUserName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
}