package com.example.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
		System.out.println("SPRING BOOT APP ON PORT 8080...");
	}

}
