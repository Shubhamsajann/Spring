package com.JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.JDBC.model.Employee;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@Autowired
	private DataSource dataSource;
	private String SQL_QUERY="SELECT *  FROM Employee";
	
	List<Employee> employees =  null;
	
	@Override
	public List<Employee> getEmployeeInfo() {
		
		try {
			 
			//register driver
			//connection
			Connection	connection =dataSource.getConnection();
			
		PreparedStatement pstmnt=connection.prepareStatement(SQL_QUERY);
		
		ResultSet rs =pstmnt.executeQuery();
		employees=new ArrayList<>();
		
		while(rs.next()) {
			Employee emp = new Employee();
			
//			Integer i=	rs.getInt(1);
//			emp.setId(i);
//			
//			String name = rs.getString(2);
//			emp.setName(name);
			
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setCity(rs.getString(3));
			
			
			employees.add(emp);
			
		}
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return employees;
		
		
		
	}

}
