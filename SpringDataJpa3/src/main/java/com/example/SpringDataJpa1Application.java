package com.example;

import java.lang.module.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.VaccineServie;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	
		VaccineServie service  =  container.getBean(VaccineServie.class);
		
//		service.featchDetailBySorting(true,"vaccineName","vaccineCompany")
//		.forEach(v->System.out.println(v.getVaccineName()+ " "+  v.getVaccineCompany()));
//		
//		service.featchDetailByPagination(0, 2,true,"vaccineName")
//		.forEach(v ->System.out.println(v.getVaccineName()) );
//	
		service.fetchDeatilsByPagination(2);
	}

}
