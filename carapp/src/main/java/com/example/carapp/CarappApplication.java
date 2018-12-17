package com.example.carapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CarappApplication {
	private static final Logger logger = LoggerFactory.getLogger(CarappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarappApplication.class, args);
	    logger.info("Hello Spring Boot");


	}

}

