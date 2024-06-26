package com.app.Doll.Service;


import com.app.Doll.Entity.TasksEntity;
import com.app.Doll.Repository.TasksRepository;
import com.app.Doll.Service.dao.idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class TasksService implements idao<TasksEntity, Long> {
    @Autowired
    private TasksRepository tasksRepository;


    @Override
    public List<TasksEntity> findAll() {
        return tasksRepository.findAll();
    }


    @Override
    public TasksEntity getById(Long id) {
        Optional<TasksEntity>optionalTasksEntity=tasksRepository.findById(id);
        return optionalTasksEntity.orElse(null);
    }


    @Override
    public void update(TasksEntity entity) {
        this.tasksRepository.save(entity);
    }


    @Override
    public void save(TasksEntity entity) {
        this.tasksRepository.save(entity);
    }


    @Override
    public void delete(TasksEntity entity) {
        this.tasksRepository.delete(entity);
    }


    @Override
    public void create(TasksEntity entity) {
        this.tasksRepository.save(entity);
    }


    @Override
    public void delete(long id_user) {


    }
}

