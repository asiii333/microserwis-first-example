package com.micro.services.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Created by Asia on 2016-05-01.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterService {
    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration.yml
        System.setProperty("spring.config.name", "registration-service");

        SpringApplication.run(RegisterService.class, args);
    }
}
