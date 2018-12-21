package com.alan.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.user.service.api.UserService;

/**
 * @author Alan Wang
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Override
    public String hello() {
        return "Hello Dubbo";
    }
}
