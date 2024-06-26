package com.app.Doll.Controller;


import com.app.Doll.Business.CompaniesBusiness;
import com.app.Doll.Dto.CompaniesDto;
import com.app.Doll.Entity.CompaniesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doll/users")
public class CompaniesController {
    @Autowired
    private CompaniesBusiness companiesBusiness;

    @GetMapping("/all")
    public List<CompaniesDto> getAllUsers(){
        return  companiesBusiness.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody CompaniesDto companiesDto) {
        companiesBusiness.create(companiesDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody CompaniesDto companiesDto) {
        companiesBusiness.update(companiesDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") CompaniesEntity entity){
        companiesBusiness.delete(entity);
    }
}
