package com.misman.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Es - Selam Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Es - Selam Servicio de Saludo Primario";
	}

	@Override
	public String getTurkishGreeting() {
		return "Es - Selam Öncelikli Tebrik Servisi";
	}

}
