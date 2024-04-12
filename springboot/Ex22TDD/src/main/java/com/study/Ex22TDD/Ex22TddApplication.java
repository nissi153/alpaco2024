package com.study.Ex22TDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex22TddApplication {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println( calc.add(10,20) );

		SpringApplication.run(Ex22TddApplication.class, args);
	}

}
