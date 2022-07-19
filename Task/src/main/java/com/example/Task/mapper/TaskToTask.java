package com.example.Task.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.example.Task.Models.TaskModel;
import com.example.Task.Models.TaskStatus;
import com.example.Task.Services.DTO.TaskInDTO;

@Component
public class TaskToTask implements IMapper<TaskInDTO, TaskModel>{

    //Nos devuelve el Task con la info de TaskInDTO
    @Override
    public TaskModel map(TaskInDTO in) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTitulo(in.getTitulo());
        taskModel.setDescripcion(in.getDescripcion());
        taskModel.setFechaexpedicion(in.getFechaexpedicion());
        taskModel.setFechacreacion(LocalDateTime.now());
        taskModel.setFinalizado(false);
        taskModel.setTaskStatus(TaskStatus.ON_TIME);
        return taskModel;
    }
    
}
