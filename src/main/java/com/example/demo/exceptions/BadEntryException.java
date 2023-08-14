package com.example.demo.exceptions;


import com.example.demo.entities.constants.enums.ErrorCodes;
import com.example.demo.web.response.Response;

public class BadEntryException extends RuntimeException{
    private Response response;
    public BadEntryException InvalidNameException(){
        response.setStatusCode(ErrorCodes.BABREQUEST_ERROR.getStatusCode());
        response.setStatus(ErrorCodes.NOTFOUND_ERROR.getStatus());
        response.setMessage(ErrorCodes.NOTFOUND_ERROR.getMessage());
        return this;
    }
}
