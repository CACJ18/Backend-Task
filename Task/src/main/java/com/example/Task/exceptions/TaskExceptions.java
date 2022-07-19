package com.example.Task.exceptions;

import org.springframework.http.HttpStatus;

public class TaskExceptions extends RuntimeException{

    private String mensaje;
    private HttpStatus HttpStatus;


    public TaskExceptions(String mensaje, HttpStatus HttpStatus) {
        super(mensaje);
        this.mensaje = mensaje;
        this.HttpStatus = HttpStatus;
    }


    public String getMensaje() {
        return this.mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public HttpStatus getHttpStatus() {
        return this.HttpStatus;
    }
    public void setHttpStatus(HttpStatus HttpStatus) {
        this.HttpStatus = HttpStatus;
    }
}
