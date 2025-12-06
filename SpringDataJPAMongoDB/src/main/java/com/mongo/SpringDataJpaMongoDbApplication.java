package com.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mongo.dto.CustomerDto;
import com.mongo.model.Customer;
import com.mongo.service.ICustomerService;
import com.mongo.util.IdGenerator;

@SpringBootApplication
public class SpringDataJpaMongoDbApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container = 	SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);
ICustomerService service = 	container.getBean(ICustomerService.class);
//insert/save customer 
//CustomerDto dto = new CustomerDto(2, "Shubham", "Gulbarga"); 
//String status = service.registerCustomer(dto); 
//System.out.println(status); 
// fetch all customers and print them 
// 	CustomerDto dto  =  new CustomerDto();
// 	dto.setId(IdGenerator.generateId());
// 	dto.setCustNo(9);
// 	dto.setName("Shru");
// 	dto.setCity("huam");
// 	String status = service.registerCustomer(dto); 
// 	System.out.println(status); 
// 	
String status  = service.removeDocument("69341c10fc87590d081e844f");
System.out.println(status);  
 service.findAllCustomer().forEach(System.out::println);
 
	}

}
