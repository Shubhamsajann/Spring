package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Services.Employee;

public class LaunchApp1 {

    public static void main(String[] args) {

        // Load Spring Container using XML configuration
        ApplicationContext container =
                new ClassPathXmlApplicationContext("applicationConfig.xml");

        // Fetching the Employee bean (id="emp") from the container
        Employee emp1 = container.getBean(Employee.class);

        // Print employee object (calls toString)
        System.out.println(emp1);

        // Print employee task (business method)
        System.out.println(emp1.employeeTask());

        System.out.println("***************************************");

        // If you create emp2, uncomment below
        // Employee emp2 = container.getBean("emp2", Employee.class);
        // System.out.println(emp2);
        // System.out.println(emp2.employeeTask());
    }
}
