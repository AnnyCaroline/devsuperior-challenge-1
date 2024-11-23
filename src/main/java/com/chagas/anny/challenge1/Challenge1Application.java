package com.chagas.anny.challenge1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Challenge1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Challenge 1");
	}
}
