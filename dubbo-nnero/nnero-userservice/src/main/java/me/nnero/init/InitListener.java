package me.nnero.init;

import me.nnero.repo.UserRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: NNERO
 * Time: 2017/11/19 23:00
 **/
@Component
public class InitListener implements ApplicationListener<ContextRefreshedEvent>{

    @Resource
    UserRepo userRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userRepo.init();
    }
}
