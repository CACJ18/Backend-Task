package com.example.Task.Services.DTO;

import java.time.LocalDateTime;

public class TaskInDTO {
    
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaexpedicion;


    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public LocalDateTime getFechaexpedicion() {
        return this.fechaexpedicion;
    }
    public void setFechaexpedicion(LocalDateTime fechaexpedicion) {
        this.fechaexpedicion = fechaexpedicion;
    }

}
