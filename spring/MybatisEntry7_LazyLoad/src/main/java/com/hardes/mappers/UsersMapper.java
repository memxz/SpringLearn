package com.hardes.mappers;

import com.hardes.pojos.Users;

import java.util.List;

public interface UsersMapper {

    List<Users> findOrdersAndUsersByOid1(int id);
    List<Users>   findUserById(int i);
}
