package com.misman.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.misman.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
