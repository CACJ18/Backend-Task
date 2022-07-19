package com.example.Task.Models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class TaskModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    private LocalDateTime fechacreacion;
    private LocalDateTime fechaexpedicion;
    private boolean finalizado;
    private TaskStatus taskStatus;

    public TaskModel(){
        
    }

    public TaskModel(Long id, String titulo, String descripcion, LocalDateTime fechacreacion, LocalDateTime fechaexpedicion, boolean finalizado, TaskStatus taskStatus) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechacreacion = fechacreacion;
        this.fechaexpedicion = fechaexpedicion;
        this.finalizado = finalizado;
        this.taskStatus = taskStatus;
    }


    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }


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


    public LocalDateTime getFechacreacion() {
        return this.fechacreacion;
    }
    public void setFechacreacion(LocalDateTime fechacreacion) {
        this.fechacreacion = fechacreacion;
    }


    public LocalDateTime getFechaexpedicion() {
        return this.fechaexpedicion;
    }
    public void setFechaexpedicion(LocalDateTime fechaexpedicion) {
        this.fechaexpedicion = fechaexpedicion;
    }


    public boolean isFinalizado() {
        return this.finalizado;
    }
    public boolean getFinalizado() {
        return this.finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }


    public TaskStatus getTaskStatus() {
        return this.taskStatus;
    }
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }    
}
