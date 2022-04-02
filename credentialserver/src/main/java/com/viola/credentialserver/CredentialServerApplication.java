package com.viola.credentialserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
//@EnableAutoConfiguration
//@EnableDiscoveryClient
@EnableEurekaClient
//@EnableSwagger2
public class CredentialServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredentialServerApplication.class, args);
	}

}
