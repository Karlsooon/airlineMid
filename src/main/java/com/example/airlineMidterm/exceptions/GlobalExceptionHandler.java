package com.example.airlineMidterm.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleException(Exception e) {
        // Log the exception
        log.error("Exception occurred", e);
        // Return an appropriate response to the client
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
    }

    // Add additional exception handlers as needed for specific exceptions

    // Example:
    // @ExceptionHandler(ResourceNotFoundException.class)
    // @ResponseStatus(HttpStatus.NOT_FOUND)
    // public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException e) {
    //     log.error("Resource not found", e);
    //     return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource Not Found");
    // }
}

