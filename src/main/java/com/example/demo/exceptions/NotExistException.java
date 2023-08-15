package com.example.demo.exceptions;

import lombok.Getter;
@Getter
public class NotExistException extends RuntimeException {

    public NotExistException(String msg){
        super(msg);
    }

}
