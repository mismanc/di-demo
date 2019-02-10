package com.misman.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Es - Selam I was injected via getter";
	}

}
