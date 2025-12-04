package com.telusko.SpringBoot01.services;

// Marks this class as a Spring Bean so Spring will detect and initialize it
import org.springframework.stereotype.Component;

// Used to perform tasks after bean creation and before bean destruction
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component // This annotation tells Spring to create an object of this class and manage its lifecycle
public class Alien {
    
    // Static block executes only once when the class is loaded (even before object creation)
    static {
        System.out.println("Static block of Alien Bean");
    }
    
    // Instance block executes every time an object is created, just before the constructor
    {
        System.out.println("Java Instance Block of Alien Bean");
    }
    
    // Constructor - executes when the bean/object is created
    public Alien() {
        System.out.println("Alien Bean Created");
    }
    
    // Runs immediately after bean creation and dependency injection
    @PostConstruct
    public void init() {
        System.out.println("Init method of Alien");
    }
    
    // Business logic method (your custom functionality)
    public void display() {
        System.out.println("Business Logic of Alien Class");
    }
    
    // Executes just before the bean is destroyed (works only in case of graceful shutdown)
    @PreDestroy 
    public void destroy() {
        System.out.println("Bean DESTROYED");
    }

}
