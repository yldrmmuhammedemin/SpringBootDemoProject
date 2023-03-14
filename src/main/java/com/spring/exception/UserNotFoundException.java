package com.spring.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer id){
        super("Couldn't find user with ID: " + id );
    }
}
