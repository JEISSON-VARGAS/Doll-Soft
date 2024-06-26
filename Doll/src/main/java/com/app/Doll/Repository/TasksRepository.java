package com.app.Doll.Repository;

import com.app.Doll.Entity.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<TasksEntity , Long> {
}
