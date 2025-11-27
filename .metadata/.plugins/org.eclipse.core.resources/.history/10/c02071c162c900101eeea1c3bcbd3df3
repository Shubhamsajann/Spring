package com.telusko.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  
// 1️⃣ Marks this class as a configuration class
//    - Spring will treat it as a source of bean definitions
//    - Similar to XML configuration, but using Java-based configuration
public class Config {

    public Config() {
        // 2️⃣ Constructor is called when Spring creates the Config bean
        //    This confirms that the configuration class itself is a Spring-managed bean
        System.out.println("Config Bean Created");
    }
    
    @Bean
    // 3️⃣ Marks the method as a bean producer
    //    - Spring will call this method to create a bean
    //    - The return value will be registered as a Spring-managed bean
    //    - Default bean ID = method name ("createPasswordBean")
    public Password createPasswordBean() {
        // 4️⃣ Create a new Password object with algorithm "SHA"
        Password pass = new Password("SHA");
        
        // 5️⃣ Return the bean to Spring container
        //    - Spring will manage this bean's lifecycle
        return pass;
    }
}
