package com.hardes;

import com.hardes.mapper.UserMapper;
import com.hardes.pojo.User;
import com.hardes.pojo.UserQueryVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class User_Test {
    @Test
    public void userTest() throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper um= (UserMapper) ac.getBean("userMapper");
        UserQueryVo uq = new UserQueryVo();
        User user = new User();

        user.setUsername("Mina");
        //user.setBirthday(new Date());
        user.setSex("M");
       // user.setAddress("Commonwealth");
        uq.setUser(user);
        //um.insertUser(user);
        //System.out.println(user);
        //um.findUserById(1);
/**
 * 传递包装pojo
 */
        List<User> list =  um.queryUserList(uq);
        for(User u : list){
            System.out.println(u);
        }
/**
 * 传递hashmap
 */
        Map<String,String> param=new HashMap<String, String>();
        param.put("username","Tom");
        param.put("sex","m");
        List<Object> list1=um.queryUserByMap(param);
        for(Object u1 : list1){
            System.out.println(u1);
        }

        User us=um.findUserById(3);

        System.out.println(us);

        /**
         * if和where
         */
        List<User> list2 =  um.queryUserList1(uq);
        for(User user1 : list2){
            System.out.println(user1);
        }
        /**
         * foreach
         */
        List<User> list3 =  um.queryUserList1(uq);
        for(User user2 : list3){
            System.out.println(user2);
        }
        /**
         * sql片段
         */
        List<User> list4 =  um.queryUserList1(uq);
        for(User user3 : list4){
            System.out.println(user3);
        }
    }
}
