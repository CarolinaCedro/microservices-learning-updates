package com.manobixdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ManobixDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManobixDiscoveryServerApplication.class, args);
    }

}
