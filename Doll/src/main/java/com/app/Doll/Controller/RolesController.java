package com.app.Doll.Controller;

import com.app.Doll.Business.RolesBusiness;
import com.app.Doll.Dto.RolesDto;
import com.app.Doll.Entity.RolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doll/roles")
public class RolesController {
    @Autowired
    private RolesBusiness rolesBusiness;

    @GetMapping("/allroles")
    public List<RolesDto> getAllUsers(){
        return rolesBusiness.findAll();
    }

    @PostMapping("/createroles")
    public void create(@RequestBody RolesDto rolesDto) {
        rolesBusiness.create(rolesDto);
    }

    @PutMapping("/updateroles")
    public void update(@RequestBody RolesDto rolesDto) {
        rolesBusiness.update(rolesDto);
    }

    @DeleteMapping("/deleteroles/{id}")
    public void delete(@PathVariable("id")RolesEntity entity){
        rolesBusiness.delete(entity);
    }
}


