package com.misman.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Es- Selam!");
		return "";
	}
	
}
