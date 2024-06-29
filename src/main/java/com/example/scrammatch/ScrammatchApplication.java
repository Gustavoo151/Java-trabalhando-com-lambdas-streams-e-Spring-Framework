package com.example.scrammatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrammatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrammatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Spring Boot!");
	}
}
