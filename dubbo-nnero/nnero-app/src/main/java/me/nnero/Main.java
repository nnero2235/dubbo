package me.nnero;

import me.nnero.rpc.UserAction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: NNERO
 * Time: 2017/11/19 22:51
 **/
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAction action = context.getBean(UserAction.class);
        System.out.println(action.getUser("nnero"));
    }
}
