package com.example.demo.exceptions;

import com.example.demo.web.response.Response;
import lombok.Getter;
@Getter
public class BookNotFoundException extends RuntimeException {
    private Response response;

    public BookNotFoundException(Integer statusCode, String status, String msg){
        response.setStatusCode(statusCode);
        response.setStatus(status);
        response.setMessage(msg);
    }

}
