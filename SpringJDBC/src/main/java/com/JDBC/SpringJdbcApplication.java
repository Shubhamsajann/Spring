package com.JDBC;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.JDBC.dao.EmployeeDaoImpl;
import com.JDBC.model.Employee;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeDaoImpl dao=container.getBean(EmployeeDaoImpl.class);
		
		List<Employee> list = dao.getEmployeeInfo();
		
		for(Employee e: list) {
			System.out.println(e);
		}
		
		

		
		
	}
	

}
