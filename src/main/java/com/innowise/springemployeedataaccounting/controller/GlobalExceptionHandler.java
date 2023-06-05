package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    //TODO add more exceptions
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorMessage> handleIllegalArgumentException() {
        return getErrorMessageResponseEntity("Illegal argument value", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorMessage> handleAccessDeniedException() {
        return getErrorMessageResponseEntity("Not authorized", HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<ErrorMessage> getErrorMessageResponseEntity(String message, HttpStatus httpStatus) {
        return new ResponseEntity<>(
                new ErrorMessage(
                        message,
                        System.currentTimeMillis()
                ), httpStatus);
    }
}
