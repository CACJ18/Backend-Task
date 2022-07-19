package com.example.Task.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Task.Models.TaskModel;
import com.example.Task.Models.TaskStatus;
import com.example.Task.Services.DTO.TaskInDTO;
import com.example.Task.exceptions.TaskExceptions;
import com.example.Task.mapper.TaskToTask;
import com.example.Task.repository.TaskRepo;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepo taskRepo;

    @Autowired
    private TaskToTask taskToTask;


    public TaskModel createTask(TaskInDTO taskInDTO){
        TaskModel taskModel = taskToTask.map(taskInDTO); //Se pasa la info al TaskModel.
        return taskRepo.save(taskModel);
    }

    public List<TaskModel> findAll(){
        return taskRepo.findAll();
    }

    public List<TaskModel> findAllByTaskStatus(TaskStatus status){
        return taskRepo.findAllByTaskStatus(status);
    }

    @Transactional 
    public void updateTaskFinished(Long id){
        Optional<TaskModel> optionalTaskModel = taskRepo.findById(id);
        if (optionalTaskModel.isEmpty()){
            throw new TaskExceptions("Task no found", HttpStatus.NOT_FOUND);
        }
        taskRepo.updateTaskFinished(id);
    }
    
    /*Forma normal:
    public void updateTaskFinished(Long id){
        taskRepo.updateTaskFinished(id);
    }*/

    public void deleteById(Long id){
        Optional<TaskModel> optionalTaskModel = taskRepo.findById(id);
        if (optionalTaskModel.isEmpty()){
            throw new TaskExceptions("Task no found", HttpStatus.NOT_FOUND);
        }
        taskRepo.deleteById(id);
    }
}
