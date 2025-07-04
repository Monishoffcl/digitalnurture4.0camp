package com.configure;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configure.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Starting Library Management System...");
    
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService bookService = context.getBean("bookService", BookService.class);
        
        bookService.addBook("The Great Gatsby");
        bookService.addBook("To Kill a Mockingbird");
        
        System.out.println("Operation completed");
    }
}
