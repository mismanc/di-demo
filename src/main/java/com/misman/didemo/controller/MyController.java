package com.misman.didemo.controller;

import org.springframework.stereotype.Controller;

import com.misman.didemo.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}
	
}
