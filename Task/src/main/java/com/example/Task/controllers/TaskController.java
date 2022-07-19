package com.example.Task.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.Task.Models.TaskModel;
import com.example.Task.Models.TaskStatus;
import com.example.Task.Services.TaskService;
import com.example.Task.Services.DTO.TaskInDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @Autowired
    TaskService taskService;

    @PostMapping
    public TaskModel createTask(@RequestBody TaskInDTO taskInDTO){
        return taskService.createTask(taskInDTO);
    }
    
    @GetMapping
    public List<TaskModel> findAll(){
        return taskService.findAll();
    }

    @GetMapping("/status/{status}")
    public List<TaskModel> findAllByTaskStatus(@PathVariable("status") TaskStatus status){
        return taskService.findAllByTaskStatus(status);
    }

    @PatchMapping("/update_finished/{id}")
    public ResponseEntity<Void> updateTaskFinished(@PathVariable("id") Long id){
        taskService.updateTaskFinished(id);
        return ResponseEntity.noContent().build(); //Luego que se ejecute nos devuelva 204 en la API
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
