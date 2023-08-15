package com.example.demo.exceptions;


import com.example.demo.models.constants.ErrorCodes;
import com.example.demo.web.response.Response;
import org.springframework.http.HttpStatus;

public class BadEntryException extends RuntimeException{
    public BadEntryException(String msg){
        super(msg);
    }
}
