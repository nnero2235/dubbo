package me.nnero.controller;

import com.alibaba.fastjson.JSON;
import me.nnero.rpc.UserAction;
import nnero.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author: NNERO
 * Time : 10:49 2017/11/20
 */
@Controller
public class AppController {

    @Autowired
    UserAction userAction;

    @RequestMapping("/user/{name}")
    @ResponseBody
    public String showUser(@PathVariable("name") String name){
        User user = userAction.getUser(name);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/users")
    @ResponseBody
    public String showUser(){
        List<User> users = userAction.listUsers();
        return JSON.toJSONString(users);
    }
}
