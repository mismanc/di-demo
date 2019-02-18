package com.misman.didemo.services;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {

		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);

		case "es":
			return new PrimarySpanishGreetingService(greetingRepository);

		case "tr":
			return new PrimaryTurkishGreetingService(greetingRepository);

		default:
			return new PrimaryGreetingService(greetingRepository);
		}

	}

}
