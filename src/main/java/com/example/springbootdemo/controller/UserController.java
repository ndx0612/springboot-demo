package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 这里的@RestController相当于@ResponseBody ＋ @Controller合在一起的作用。
@RestController
public class UserController {
    @Autowired
    public UserService userService;

    //    这里的@RequestMapping注解，用来映射请求的URL，请求方式默认为GET。
    @RequestMapping("/user")
    public List<User> userAll() {
        return userService.findAll();
    }

    @RequestMapping("/user/{id}")
    public User userById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    //    添加用户，请求方式为POST
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    //    修改用户，请求方式为PUT
    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    public int updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    //    删除用户，请求方式为DELETE
    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public int deleteUser(@PathVariable("id") int id) {
        return userService.deleteUser(id);
    }

}
