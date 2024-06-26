package com.app.Doll.Controller;

import com.app.Doll.Business.ServicesBusiness;
import com.app.Doll.Dto.ServiceDto;
import com.app.Doll.Entity.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doll/services")
public class ServiceController {
    @Autowired
    private ServicesBusiness servicesBusiness;

    @GetMapping("/allservices")
    public List<ServiceDto> GetAllUser() {
        return servicesBusiness.findAll();
    }
    @PostMapping("/createservices")
    public void create(@RequestBody ServiceDto serviceDto) {
        servicesBusiness.create(serviceDto);
    }
    @PutMapping("/updateservices")
    public void update(@RequestBody ServiceDto serviceDto) {
        servicesBusiness.update(serviceDto);
    }
    @DeleteMapping("/deleteservices/{id}")
    public void delete(@PathVariable("id") ServiceEntity entity) {
        servicesBusiness.delete(entity);
    }
}
