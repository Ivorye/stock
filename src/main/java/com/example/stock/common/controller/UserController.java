package com.example.stock.common.controller;

import com.example.stock.common.entity.User;
import com.example.stock.common.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getAllUsers(){
//        return  userMapper.getAllUsers();
        return  userMapper.selectList(null);
    }

    @GetMapping("/user/id")
    public User getUser(User user){
        return userMapper.selectById(user.getId());
    }
    @PostMapping("/user/add")
    public String save(User user){
        int i = userMapper.insert(user);
        if (i>0){
            return "Insert succeed";
        }else{
            return "Insert failed";
        }
    }

    @DeleteMapping("/user/delete")
    public String delete(User user){
//        int i = userMapper.delete(user);
        int i = userMapper.deleteById(user);
        if(i>0){
            return "delete user succeed";
        }else {
            return "delete user failed";
        }

    }

}
