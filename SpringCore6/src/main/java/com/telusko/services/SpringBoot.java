package com.telusko.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpringBoot implements ICourse {

    public SpringBoot() {
        System.out.println("SpringBoot Bean Created");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring Boot course is purchased and amount paid is " + amount);
        return true;
    }
}
