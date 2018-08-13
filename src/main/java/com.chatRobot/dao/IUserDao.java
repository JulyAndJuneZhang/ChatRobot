package com.chatRobot.dao;


import com.chatRobot.model.User;

/**
 * Created by zkq19 on 2018/8/13.
 */
public interface IUserDao {
    User selectUser(long id);
}
