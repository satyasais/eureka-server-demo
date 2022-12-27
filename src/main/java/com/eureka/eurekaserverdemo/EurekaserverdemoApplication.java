package com.eureka.eurekaserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverdemoApplication.class, args);
	}

}
