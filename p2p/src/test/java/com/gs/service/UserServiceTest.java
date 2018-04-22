package com.gs.service;

import com.gs.bean.User;
import com.gs.common.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/01/08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/config/spring-*.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getByIdPasswordTest() {
        User user  = userService.getByIdPassword(1l);
        System.out.println("...."+ user.getUid());
    }
}
