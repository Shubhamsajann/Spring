package com.telusko.config;
import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

public class JavaConfig {
	

	@ComponentScan(basePackages ={"com.telusko"})
	public class JavaConfiguration {
		
		 public JavaConfiguration() {
		
			 System.out.println("Java Config Bean Created");
		}
		 @Bean
		 public  LocalDateTime createTimeObject() {
			 return LocalDateTime.now();
		 } 

	}

}
