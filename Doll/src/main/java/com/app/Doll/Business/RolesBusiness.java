package com.app.Doll.Business;
import com.app.Doll.Dto.RolesDto;
import com.app.Doll.Entity.RolesEntity;
import com.app.Doll.Service.RolesService;
import com.app.Doll.Utilites.Exceptions.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RolesBusiness {
    @Autowired
    private RolesService rolesService;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<RolesDto> findAll() {
        try {
            List<RolesEntity> rolesEntityList = rolesService.findAll();
            List<RolesDto> rolesDtoList = new ArrayList<>();

            for (RolesEntity roles : rolesEntityList) {
                rolesDtoList.add(modelMapper.map(roles, RolesDto.class));
            }

            return rolesDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al obtener los usuarios", e);
        }
    }
    public void create(RolesDto rolesDto) {
        try {
            RolesEntity roles = modelMapper.map(rolesDto, RolesEntity.class);
            rolesService.save(roles);
        } catch (Exception e) {
            throw new CustomException("Error al crear el usuario", e);
        }
    }
    public void update(RolesDto rolesDto) {
        try {
            RolesEntity roles = modelMapper.map(rolesDto, RolesEntity.class);
            rolesService.update(roles);
        } catch (Exception e) {
            throw new CustomException("Error al actualizar el usuario", e);
        }
    }
    public void delete(RolesEntity entity) {
        try {
            rolesService.delete(entity);
        } catch (Exception e) {
            throw new CustomException("Error al eliminar el usuario", e);
        }
    }
}
