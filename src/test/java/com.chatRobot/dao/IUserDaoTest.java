package com.chatRobot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chatRobot.model.User;


/**
 * Created by zkq19 on 2018/8/13.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao iUserDao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = iUserDao.selectUser(id);
        System.out.println(user.getUsername());
    }
}
