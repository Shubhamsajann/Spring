package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.main.service.Password; // Import the Password service class

import Main.Telusko;

public class LaunchApp1 {

    public static void main(String[] args) {
        
       
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
        
        // Get Telusko bean from container
        com.telusko.services.Telusko t = container.getBean(com.telusko.services.Telusko.class);

        // Call business logic
        Boolean b = t.buythecourse(44.44);

        if (b) {
            System.out.println("Course purchased");
        } else {
            System.out.println("Course failed to purchase");
        }
        
   
    }
}
