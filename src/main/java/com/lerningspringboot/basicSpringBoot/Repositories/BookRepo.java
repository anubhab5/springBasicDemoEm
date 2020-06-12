package com.lerningspringboot.basicSpringBoot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lerningspringboot.basicSpringBoot.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
