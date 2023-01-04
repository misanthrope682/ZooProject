package com.mkyong.examples.exception;



public class ListTooLargeException extends RuntimeException{

    public ListTooLargeException(String message) {
        super(message);
    }

}