package com.micro.services.account;

import com.micro.application.account.AccountApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by Asia on 2016-05-01.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountApp.class)
public class AccountService {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "account-service");
        SpringApplication.run(AccountService.class, args);
    }

}
