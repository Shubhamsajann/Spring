package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Services.Employee;

public class LaunchApp1 {

    public static void main(String[] args) {

        // Loading the Spring XML configuration file
        // Spring will create and manage all beans defined in applicationConfig.xml
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");

        // Fetching bean 'emp1' from container
        Employee emp1 = container.getBean("emp1", Employee.class);
        System.out.println(emp1);                 // Prints emp1 details via toString()
        System.out.println(emp1.employeeTask());  // Calls business method

        System.out.println("***************************************");

        // Fetching bean 'emp2' from container
        Employee emp2 = container.getBean("emp2", Employee.class);
        System.out.println(emp2);                 // Prints emp2 details
        System.out.println(emp2.employeeTask());  // Calls business method
    }
}
