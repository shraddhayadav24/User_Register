package org.example;

public class InvalidUserDetailExecption extends  Exception {
    String message;
    public InvalidUserDetailExecption(String message){
        super(message);
    }
}

