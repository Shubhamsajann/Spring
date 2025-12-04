package com.telusko.SpringBoot01.services;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring-managed bean
public class GreeetingService implements IGreeting {

	public GreeetingService() {
		System.out.println("Greetings Service bean Created");
	}

	@Autowired // Injects LocalTime bean automatically
	private LocalTime time;

	@Override
	public String generateWish(String name) {

		// Get current hour from system time
		int hour = time.getHour();

		// Based on the hour, return appropriate greeting
		if (hour < 12) {
			return "Good Morning " + name;
		} else if (hour < 16) {
			return "Good Afternoon " + name;
		} else if (hour < 20) {
			return "Good Evening " + name;
		} else {
			return "Good Night " + name;
		}
	}
}
