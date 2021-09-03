package com.example.practicemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PracticeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeMicroserviceApplication.class, args);
	}

}
