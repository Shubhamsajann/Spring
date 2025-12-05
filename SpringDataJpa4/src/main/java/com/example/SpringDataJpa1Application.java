package com.example;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Vaccine;
import com.example.service.VaccineServie;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);

		 VaccineServie service  =  container.getBean(VaccineServie.class);
//		 Vaccine vac =service.searchVaccineById(17);
//		 System.out.println(vac);
		 
//		 service.searchVaccineByGivenId(null, true,"vaccineName").forEach(System.out::println);

//		 Vaccine vac = new Vaccine("Sql","shubham",0.0);
//		 vac.setId(17);
//
//         service.searchVaccineByGivenId(vac).forEach(System.out::println);	
		 List<Integer> ids  =  new ArrayList<>();
		 ids.add(14);
		 ids.add(16);
		 ids.add(18);
		 
	     String status =	 service.removeVaccineInfoById(ids);
	     System.out.println(status);
		 
		 
		 
		 
	}

}
