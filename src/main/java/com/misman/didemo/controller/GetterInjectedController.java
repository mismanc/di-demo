package com.misman.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.misman.didemo.services.GreetingService;

@Controller
public class GetterInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	@Qualifier("getterGreetingService") 
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
