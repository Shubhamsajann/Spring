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
//		 service.fetchByVaccineCompany("Astrazanica").forEach(v->System.out.println(v));
//	 
//		 
//		 service.fetchByVaccineCompany("Astrazanica","who").forEach(v->System.out.println(v));
//		 
		

		// service.fetchvaccineByCost(100.0, 100000.0).forEach(v->System.out.println(v));
//		int rowAffrect= service.updadteThePriceByVaccineName(10.1, "covidshild");
//		
//		if(rowAffrect !=0) {
//			System.out.println("Update success");
//		}
//		else {
//			System.out.println("Update failed");
//		}
		 
//		 
//		 int rowAffrect= service.deleteTheVaccineByvaccineName("covidshild");
//		
//		if(rowAffrect !=0) {
//				System.out.println("Record Deletion successful");
//		}
//		else {		System.out.println("record  failed");
//		}
		 
		 
		 int rowAffrect= service.insertVaccineDetails("shubham", "shrusti", 100.10);
		 int rowAffrect2= service.insertVaccineDetails("shubhamsajjan", "shrustiimdapur", 101.10);
			
			if(rowAffrect !=0) {
					System.out.println("Record Inserted successful");
			}
			else {		System.out.println("Record Deleted  failed");
			}
		 
		 
	}

}
