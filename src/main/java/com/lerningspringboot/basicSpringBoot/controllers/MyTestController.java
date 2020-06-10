package com.lerningspringboot.basicSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lerningspringboot.basicSpringBoot.entity.Book;

@RestController
public class MyTestController {

	@GetMapping("/book")
	public Book myFirstSpringMethod() {
		return new Book(1, "Automata", "Kling", 5);
	}

}
