package com.example.demo.exceptions;

import com.example.demo.web.response.Response;
import lombok.Getter;
@Getter
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String msg){
        super(msg);
    }

}
