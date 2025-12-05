package com.example;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.service.VaccineServie;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);

		 VaccineServie service  =  container.getBean(VaccineServie.class);
	
		// service.featchByCost(40.0).forEach(v->System.out.println(v));
		// service.featchByCostLessThenEqual(50.0).forEach(v->System.out.println(v));
//		 service.featchByCostBetween(50.0,100000.00).forEach(v->System.out.println(v));
		// service.featchByVaccineCompanyEquals("moderena").forEach(v->System.out.println(v));
		 
		 Collection<String> vaccineCompany= new HashSet<>();
		 vaccineCompany.add("Astrazanica");
		 vaccineCompany.add("who");
		 
		 service.fetchByVaccineCompanyInAndCostBetween(vaccineCompany, 39.00, 10000.0).forEach(v->System.out.println(v));;
		 
		 
	}

}
