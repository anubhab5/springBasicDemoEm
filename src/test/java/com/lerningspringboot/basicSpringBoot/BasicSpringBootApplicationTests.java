package com.lerningspringboot.basicSpringBoot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lerningspringboot.basicSpringBoot.Repositories.BookRepo;
import com.lerningspringboot.basicSpringBoot.entity.Book;

@SpringBootTest
class BasicSpringBootApplicationTests {

	@Autowired
	BookRepo bookR;

	@Test
	void saveBook() {
		Book b1 = new Book();
		b1.setAuthor("TestAuthor");
		b1.setName("testName");
		b1.setCount(2);
		Book savedBook = bookR.save(b1);
		assertNotNull(savedBook);
	}

	@Test
	void getBook() {
		Book b1 = bookR.findById(12).get();
		assertEquals("TestAuthor", b1.getAuthor());
	}

	@Test
	void updateBook() {
		Book b1 = bookR.findById(12).get();
		b1.setAuthor("Author Updated");
		bookR.save(b1);
		assertEquals("Author Updated", b1.getAuthor());
	}

	@Test
	void deleteBook() {
		bookR.deleteById(13);
		Optional<Book> b1 = bookR.findById(12);
		assertEquals(false, b1.isPresent());		
	}

}
