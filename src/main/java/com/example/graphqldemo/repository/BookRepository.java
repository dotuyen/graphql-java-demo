package com.example.graphqldemo.repository;

import com.example.graphqldemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
