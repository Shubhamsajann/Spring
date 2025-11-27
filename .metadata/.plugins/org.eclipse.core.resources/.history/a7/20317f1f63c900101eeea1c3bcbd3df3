package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.main.service.Password; // Import the Password service class

public class LaunchApp1 {

    public static void main(String[] args) {
        
        // 1️⃣ Load Spring XML configuration
        // This will create the Spring IoC container and initialize all beans defined in applicationConfig.xml
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
        
        // 2️⃣ At this point:
        // - All beans annotated with @Component, @Service, @Repository, @Controller 
        //   in the scanned package (com.telusko) are automatically created
        // - Spring manages their lifecycle, dependencies, and configuration
        
        // 3️⃣ Retrieve beans from the container
        // You can get beans either by class type or by bean ID
        // Here, we retrieve the Password bean by its class
        Password p = container.getBean(Password.class);
        
        // 4️⃣ Call business logic method of the bean
        // passwordAlgo() is a method defined inside Password class
        // Spring ensures that the bean is fully initialized and ready to use
        p.passwordAlgo();
    }
}
