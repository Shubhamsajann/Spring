package com.example;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Vaccine;
import com.example.service.VaccineServie;
import com.example.view.ResultView1;
import com.example.view.ResultView2;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		 VaccineServie service  =  container.getBean(VaccineServie.class);
	
		service.fetchByCostLessThan(500.0,ResultView2.class)
		.forEach(v->System.out.println(v.getVaccineName()+" "+v.getcost()));
		 
	}

}
