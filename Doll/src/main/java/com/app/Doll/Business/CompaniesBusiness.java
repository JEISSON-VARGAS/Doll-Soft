package com.app.Doll.Business;


import com.app.Doll.Dto.CompaniesDto;
import com.app.Doll.Entity.CompaniesEntity;
import com.app.Doll.Service.CompaniesService;
import com.app.Doll.Utilites.Exceptions.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompaniesBusiness {
    @Autowired
    private CompaniesService companiesService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<CompaniesDto> findAll() {
        try {
            List<CompaniesEntity> companiesEntityList = companiesService.findAll();
            List<CompaniesDto> companiesDtoList = new ArrayList<>();

            for (CompaniesEntity companies : companiesEntityList) {
                companiesDtoList.add(modelMapper.map(companies, CompaniesDto.class));
            }

            return companiesDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al obtener las companias", e);

        }
    }

    public void create(CompaniesDto companiesDto) {
        try {
            CompaniesEntity companies = modelMapper.map(companiesDto, CompaniesEntity.class);
            companiesService.save(companies);
        } catch (Exception e) {
            throw new CustomException("Error al crear al crear la compania", e);
        }
    }

    public void update(CompaniesDto companiesDto) {
        try {
            CompaniesEntity companies = modelMapper.map(companiesDto, CompaniesEntity.class);
            companiesService.update(companies);
        } catch (Exception e) {
            throw new CustomException("Error al actualizar la compania", e);
        }
    }

    public void delete(CompaniesEntity entity) {
        try {
            companiesService.delete(entity);
        } catch (Exception e) {
            throw new CustomException("Error al eliminar el servicio", e);
        }
    }

}
