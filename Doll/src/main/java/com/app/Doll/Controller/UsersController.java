package com.app.Doll.Controller;

import com.app.Doll.Business.UserBusiness;
import com.app.Doll.Dto.UsersDto;
import com.app.Doll.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doll/users")
public class UsersController {
    @Autowired
    private UserBusiness usersBusiness;

    @GetMapping("/allusers")
    public List<UsersDto> GetAllUser() {
        return usersBusiness.findAll();
    }

    @PostMapping("/createusers")
    public void create(@RequestBody UsersDto usersDto) {
        usersBusiness.create(usersDto);
    }

    @PutMapping("/updateusers")
    public void update(@RequestBody UsersDto usersDto) {
        usersBusiness.update(usersDto);
    }

    @DeleteMapping("/deleteusers/{id}")
    public void delete(@PathVariable("id") UserEntity entity) {
        usersBusiness.delete(entity);
    }
}
