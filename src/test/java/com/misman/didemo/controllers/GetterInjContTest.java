package com.misman.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.misman.didemo.controller.GetterInjectedController;
import com.misman.didemo.services.GreetingServiceImpl;

public class GetterInjContTest {

	private GetterInjectedController getterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_ALL, getterInjectedController.sayHello());
	}

}
