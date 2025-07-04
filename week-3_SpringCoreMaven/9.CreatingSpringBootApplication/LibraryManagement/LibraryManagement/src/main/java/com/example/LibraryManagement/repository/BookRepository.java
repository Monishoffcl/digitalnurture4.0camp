package com.example.LibraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthor(String author);
}

