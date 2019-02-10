package com.misman.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.misman.didemo.controller.ConstructorInjectedController;
import com.misman.didemo.services.GreetingServiceImpl;

public class ConstructorInjContTest {

	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_ALL, constructorInjectedController.sayHello());
	}
	
}
