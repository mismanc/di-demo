package com.misman.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.misman.didemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
