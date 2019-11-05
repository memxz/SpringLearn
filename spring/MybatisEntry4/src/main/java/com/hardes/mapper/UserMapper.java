package com.hardes.mapper;


import com.hardes.pojo.User;
import com.hardes.pojo.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(int id) throws Exception;

    void insertUser(User user) throws Exception;

   List<User> queryUserList(UserQueryVo user) throws  Exception;
   List<Object> queryUserByMap(Map map);
   User findUserByIdFormap(int id) throws Exception;
   List<User> queryUserList1(UserQueryVo user) throws Exception;
   List<User> queryUserList2(UserQueryVo user) throws Exception;
   List<User> queryUserList3(UserQueryVo user) throws Exception;
}
