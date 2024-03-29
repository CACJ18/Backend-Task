package com.example.Task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Task.Models.TaskModel;
import com.example.Task.Models.TaskStatus;

@Repository
public interface TaskRepo extends JpaRepository<TaskModel, Long>{
    
    public List<TaskModel> findAllByTaskStatus(TaskStatus status);

    @Modifying //Para marcar que la QUERY es una QUERY de UPDATE
    @Query(value = "UPDATE TASK SET FINALIZADO=true WHERE ID=:id", nativeQuery = true)
    public void updateTaskFinished(@Param("id") Long id);
}
