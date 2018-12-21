package com.alan.hello.dubbo.service.user.provider.api.impl;

import com.alan.hello.dubbo.service.user.api.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Alan Wang
 * @date 2018/12/21 21:14
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo.";
    }
}
