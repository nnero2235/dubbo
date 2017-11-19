package me.nnero.repo;

import nnero.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;

/**
 * Author: NNERO
 * Time: 2017/11/19 22:23
 **/
@Repository
public class UserRepo {

    private static final LinkedHashMap<String,User> USER_MAP = new LinkedHashMap<String, User>();

    public void init(){
        System.out.println("userrepo init");
        User user = new User();
        user.setName("nnero");
        user.setPassword("123456");
        user.setStartTime(Timestamp.valueOf("2017-11-19 00:00:00"));
        user.setStatus(0);
        USER_MAP.put("nnero",user);
    }

    public User getUser(String name){
        return USER_MAP.get(name);
    }

    public List<User> listUsers(){
        List<User> users = new ArrayList<User>();
        for(Map.Entry<String,User> userEntry : USER_MAP.entrySet()){
            users.add(userEntry.getValue());
        }
        return users;
    }
}
