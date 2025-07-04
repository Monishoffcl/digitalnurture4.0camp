package com.constructorandsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructorandsetter.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Starting Library Management System...");
    
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
       BookService bookServiceSetter = (BookService) context.getBean("bookServiceSetter");

        bookServiceSetter.addBook("Whispers of the Forgetten");
        bookServiceSetter.addBook("The Last Ember");
        
        System.out.println("Operation completed");
    }
}
