package com.study.Ex23Schduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Ex23SchdulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex23SchdulerApplication.class, args);
	}

}
