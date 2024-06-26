package com.app.Doll.Controller;
import com.app.Doll.Dto.TasksDto;
import com.app.Doll.Business.TasksBusiness;
import com.app.Doll.Entity.TasksEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doll/tasks")
public class TasksController {
    @Autowired
    private TasksBusiness tasksBusiness;
    @GetMapping("/all")
    public List<TasksDto> getAllUsers(){
        return tasksBusiness.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody TasksDto tasksDto) {
        tasksBusiness.create(tasksDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody TasksDto tasksDto) {
        tasksBusiness.update(tasksDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") TasksEntity entity){
        tasksBusiness.delete(entity);
    }
}
