package com.telusko.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringBoot01.services.GreeetingService;

@SpringBootApplication // Enables Spring Boot auto configuration and component scanning
public class SpringBoot01Application {
	public static void main(String[] args) {

		// Starts the Spring container and returns IOC container object
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot01Application.class);

		// Get GreetingService bean from the IOC container
		GreeetingService greet = container.getBean(GreeetingService.class);

		// Call method and print returned wish
		System.out.println(greet.generateWish("Sai g"));
		container.close();
	}
}
