package com.example.demo.models.constants;

import lombok.Getter;

@Getter
public enum ErrorCodes {//more specific error
    BOOK_NOTFOUND_ERROR( "Book Not Found", "Book Doesn't exist in database"),
    USER_NOTFOUND_ERROR( "User Not Found", "User Doesn't exist in database"),
    BADREQUEST_ERROR("Bad Request to Database", "Check your request and try again");


    private String status;
    private String message;

    ErrorCodes(String status, String message) {

        this.status = status;
        this.message = message;
    }
}
