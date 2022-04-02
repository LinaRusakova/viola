package com.viola.rootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RootServerApplication.class, args);

	}

}
