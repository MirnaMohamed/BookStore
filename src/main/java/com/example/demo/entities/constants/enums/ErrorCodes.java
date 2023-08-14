package com.example.demo.entities.constants.enums;

import lombok.Getter;

@Getter
public enum ErrorCodes {
    NOTFOUND_ERROR(101, "Entity Not Found", "Book Not Found"),
    BABREQUEST_ERROR(500, "Bad Request to Database", "Check your request and try again");

    private int statusCode;
    private String status;
    private String message;

    ErrorCodes(int errorCode, String status, String message) {
        this.statusCode = errorCode;
        this.status = status;
        this.message = message;
    }
}
