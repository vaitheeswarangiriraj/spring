package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchduledTask {
	
	@Scheduled(fixedRate = 5000)
	public void display()
	{
		System.out.println("Hi");
	}

}
