package com.lerningspringboot.basicSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

	@GetMapping("/hello")
	public String myFirstSpringMethod() {
		return "Hello Spring";
	}

}
