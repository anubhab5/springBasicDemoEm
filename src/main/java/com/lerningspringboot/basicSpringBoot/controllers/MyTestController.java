package com.lerningspringboot.basicSpringBoot.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyTestController {

	public String myFirstSpringMethod() {
		return "Hello Spring";
	}

}
