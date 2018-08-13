package com.chatRobot.service;

import com.chatRobot.model.User;

/**
 * Created by zkq19 on 2018/8/13.
 */
public interface IUserService {
    public User selectUser(long userId);
}
