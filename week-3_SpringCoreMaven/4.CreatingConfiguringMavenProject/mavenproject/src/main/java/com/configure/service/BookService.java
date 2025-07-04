package com.configure.service;

import com.configure.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[Service] Adding book: " + bookName);
        bookRepository.save(bookName);
    }
}
