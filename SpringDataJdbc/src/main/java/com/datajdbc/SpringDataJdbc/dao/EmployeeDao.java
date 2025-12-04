package com.datajdbc.SpringDataJdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String sql = "INSERT INTO EMPLOYEE(id,name,city) VALUES (1,'shrusti','kalaburgi')";
	
	public void input() {
		
		jdbcTemplate.update(sql);
		System.out.println("Data inserted");
		
	}
	

}
