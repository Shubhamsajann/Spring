package com.telusko.main.web;

import org.springframework.stereotype.Controller;

@Controller  // Marks this class as a Spring MVC controller bean
public class WebLayer {

    public WebLayer() {
        // Constructor prints message when bean is created
        System.out.println("WebLayer Bean Created");
    }

}
