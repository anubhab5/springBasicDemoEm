package com.lerningspringboot.basicSpringBoot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lerningspringboot.basicSpringBoot.Repositories.BookRepo;
import com.lerningspringboot.basicSpringBoot.entity.Book;

@RestController
public class MyTestController {

	@Autowired
	BookRepo bookrep;

	@GetMapping("/book")
	public List<Book> getBookList() {
		return bookrep.findAll();
	}

	@PostMapping("/book")
	public Book createBook(@RequestBody Book book) {
		return bookrep.save(book);
	}

	@PutMapping("/book/{id}")
	public Book editBook(@PathVariable int id, @RequestBody Book bookObj) {
		bookObj.setId(id); // Setting the id for the record where change is reqd.
		return bookrep.save(bookObj); // Setting the entire value that is coming up
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		bookrep.deleteById(id);
		return "Deletion Success";
	}

}
