package com.misman.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.misman.didemo.controller.PropertyInjectedController;
import com.misman.didemo.services.GreetingServiceImpl;

public class PropertyInjContTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_ALL, propertyInjectedController.sayHello());
	}
	
}
