package com.app.Doll.Business;
import com.app.Doll.Dto.TasksDto;
import com.app.Doll.Entity.TasksEntity;
import com.app.Doll.Service.TasksService;
import com.app.Doll.Utilites.Exceptions.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class TasksBusiness {
    @Autowired
    private TasksService tasksService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<TasksDto> findAll() {
        try {
            List<TasksEntity> tasksEntityList = tasksService.findAll();
            List<TasksDto> tasksDtoList = new ArrayList<>();

            for (TasksEntity tasks : tasksEntityList) {
                tasksDtoList.add(modelMapper.map(tasks, TasksDto.class));
            }

            return tasksDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al obtener las tareas", e);
        }
    }
    public void create(TasksDto tasksDto) {
        try {
            TasksEntity tasks = modelMapper.map(tasksDto, TasksEntity.class);
            tasksService.save(tasks);
        } catch (Exception e) {
            throw new CustomException("Error al crear la tarea", e);
        }

    }


    public void update(TasksDto tasksDto) {
    }

    public void delete(TasksEntity entity) {
    }
}