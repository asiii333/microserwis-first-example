package com.micro.services.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Asia on 2016-05-02.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ClientService {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "client-service");
        SpringApplication.run(ClientService.class, args);
    }

}

