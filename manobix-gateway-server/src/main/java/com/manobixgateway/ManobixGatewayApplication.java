package com.manobixgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManobixGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManobixGatewayApplication.class, args);
	}

}
