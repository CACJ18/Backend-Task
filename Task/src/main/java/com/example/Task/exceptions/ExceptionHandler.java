package com.example.Task.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{
    //Nos permite manejar todas las Exceptions.

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {TaskExceptions.class})
    protected ResponseEntity<Object> handleConflict(
        TaskExceptions ex, WebRequest request) {
            String bodyOfResponse = ex.getMensaje();
            return handleExceptionInternal(ex, bodyOfResponse, 
            new HttpHeaders(), ex.getHttpStatus(), request);
        }
}
