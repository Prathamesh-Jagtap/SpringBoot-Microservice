package com.JobMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JobMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobMicroApplication.class, args);
	}

}
