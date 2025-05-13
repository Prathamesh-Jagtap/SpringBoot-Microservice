package com.jobmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregmicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregmicroApplication.class, args);
	}

}
