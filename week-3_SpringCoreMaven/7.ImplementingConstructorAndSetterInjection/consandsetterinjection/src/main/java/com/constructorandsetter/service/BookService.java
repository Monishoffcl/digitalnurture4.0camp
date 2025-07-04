package com.constructorandsetter.service;

import com.constructorandsetter.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[Service] Adding book: " + bookName);
        bookRepository.save(bookName);
    }
}
