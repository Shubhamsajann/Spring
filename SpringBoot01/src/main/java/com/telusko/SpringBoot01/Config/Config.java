package com.telusko.SpringBoot01.Config;

import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this class as a configuration class
public class Config {

	public Config() {
		System.out.println("Config Bean Created");
	}

	@Bean // Registers LocalTime as a bean in Spring Container
	public LocalTime createTime() {
		return LocalTime.now();  // Returns current time
	}
}
