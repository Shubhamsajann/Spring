package com.example;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.service.VaccineServie;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);

		 VaccineServie service  =  container.getBean(VaccineServie.class);
		 service.fetchByVaccineCompany("Astrazanica").forEach(v->System.out.println(v));
	 
		 
		 service.fetchByVaccineCompany("Astrazanica","who").forEach(v->System.out.println(v));
		 
		

		 
	}

}
