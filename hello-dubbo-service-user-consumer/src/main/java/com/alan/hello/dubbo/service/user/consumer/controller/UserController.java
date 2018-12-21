package com.alan.hello.dubbo.service.user.consumer.controller;

import com.alan.hello.dubbo.service.user.api.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Wang
 * @date 2018/12/21 22:24
 */
@RestController
public class UserController {

    @Reference(version = "${user.server.version}")
    private UserService userService;

    @GetMapping("say")
    public String sayHello() {
        return userService.sayHello();
    }
}
