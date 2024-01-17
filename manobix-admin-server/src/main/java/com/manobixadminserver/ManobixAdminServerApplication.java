package com.manobixadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManobixAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManobixAdminServerApplication.class, args);
    }

}
