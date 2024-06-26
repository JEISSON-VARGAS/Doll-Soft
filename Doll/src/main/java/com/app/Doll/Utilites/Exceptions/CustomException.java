package com.app.Doll.Utilites.Exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException {
    private final HttpStatus httpStatus;

    // Constructor with message and original exception
    public CustomException(String message, Exception e) {
        super(message, e);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR; // Default value
    }

    // Constructor with message and HTTP status
    public CustomException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}