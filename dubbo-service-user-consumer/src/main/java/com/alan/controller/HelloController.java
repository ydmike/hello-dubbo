package com.alan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.user.service.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Wang
 */
@RestController
public class HelloController {

    @Reference(version = "${${user.service.version}}")
    private UserService userService;

    @RequestMapping(value = "hi")
    public String sayHi() {
        return userService.hello();
    }
}
