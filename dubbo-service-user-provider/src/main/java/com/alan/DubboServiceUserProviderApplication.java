package com.alan;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alan Wang
 */
@SpringBootApplication
public class DubboServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceUserProviderApplication.class, args);
        Main.main(args);
    }

}

