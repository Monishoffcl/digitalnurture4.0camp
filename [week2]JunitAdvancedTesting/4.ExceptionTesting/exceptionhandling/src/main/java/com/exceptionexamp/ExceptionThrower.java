package com.exceptionexamp;


public class ExceptionThrower {
    public static void main (String args[]){
    
}
    public void throwException() throws IllegalArgumentException {
        throw new IllegalArgumentException("This is an expected exception.");
    }
}
