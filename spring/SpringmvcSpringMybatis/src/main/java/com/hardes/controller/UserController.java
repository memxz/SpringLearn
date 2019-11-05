package com.hardes.controller;

import com.hardes.dao.UserDao;
import com.hardes.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;  //method = RequestMethod.GET
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired(required = false)
    private UserDao userDao;

    @RequestMapping(value ="/phone", method = GET)
    public User test(){
        return userDao.findByAppid("12");
    }

    //-http://localhost:8080/test/add?name=abc&passwd=123&appid=95955542783
    @RequestMapping(value = "/add", method = GET)
    public User save(@RequestParam("name") String name,
                     @RequestParam(value = "passwd",defaultValue = "0") String passwd,
                     @RequestParam(value = "appid",defaultValue = "0") String appid) {
        User user = new User(name,passwd,appid);
        userDao.addUser(user);
        return userDao.findById(user.getId());
    }



    @RequestMapping(value = "/delete", method = GET)
    public void delete(@RequestParam("id") Integer id) {
        userDao.deleteById(id);
    }

}