package com.misman.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_ALL = "Es-Selam to All";
	
	@Override
	public String sayGreeting() {
		return HELLO_ALL;
	}

}
