package com.mavenproject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenproject.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Starting Library Management System...");
    
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService bookService = context.getBean("bookService", BookService.class);
        
        bookService.addBook("Pride and Prejudice");
        bookService.addBook("The Catcher in the Rye");
        
        System.out.println("Operation completed");
    }
}
