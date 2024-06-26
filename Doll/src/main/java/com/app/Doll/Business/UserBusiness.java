package com.app.Doll.Business;

import com.app.Doll.Dto.UsersDto;
import com.app.Doll.Entity.UserEntity;
import com.app.Doll.Service.UsersService;
import com.app.Doll.Utilites.Exceptions.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBusiness {
    @Autowired
    private UsersService usersService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<UsersDto> findAll() {
        try {
            List<UserEntity> usersList = usersService.findAll();
            List<UsersDto> usersDtoList = new ArrayList<>();

            for (UserEntity user : usersList) {
                usersDtoList.add(modelMapper.map(user, UsersDto.class));
            }

            return usersDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al obtener los usuarios", e);
        }
    }

    public void create(UsersDto usersDto) {
        try {
            UserEntity user = modelMapper.map(usersDto, UserEntity.class);
            usersService.save(user);
        } catch (Exception e) {
            throw new CustomException("Error al crear el usuario", e);
        }
    }

    public void update(UsersDto usersDto) {
        try {
            UserEntity user = modelMapper.map(usersDto, UserEntity.class);
            usersService.update(user);
        } catch (Exception e) {
            throw new CustomException("Error al actualizar el usuario", e);
        }
    }

    public void delete(UserEntity entity) {
        try {
            usersService.delete(entity);
        } catch (Exception e) {
            throw new CustomException("Error al eliminar el usuario", e);
        }
    }

}
