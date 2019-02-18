package com.misman.didemo.services;

public class PrimaryTurkishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryTurkishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getTurkishGreeting();
	}

}
