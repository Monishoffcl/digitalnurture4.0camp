package com.constructorandsetter.repository;

public class BookRepository {
    public void save(String bookName) {
        System.out.println("[Repository] Saving book: " + bookName);
    }
}