package com.app.Doll.Service;






import com.app.Doll.Entity.UserEntity;
import com.app.Doll.Repository.UsersRepository;
import com.app.Doll.Service.dao.idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class UsersService implements  idao<UserEntity , Long >{
    @Autowired
    UsersRepository usersRepository;


    @Override
    public List<UserEntity> findAll() {
        return usersRepository.findAll();
    }


    @Override
    public UserEntity getById(Long id) {
        Optional<UserEntity>optionalUserEntity = usersRepository.findById(id);
        return optionalUserEntity.orElse(null);
    }


    @Override
    public void update(UserEntity entity) {
        this.usersRepository.save(entity);
    }


    @Override
    public void save(UserEntity entity) {
        this.usersRepository.save(entity);
    }


    @Override
    public void delete(UserEntity entity) {
        this.usersRepository.delete(entity);
    }


    @Override
    public void create(UserEntity entity) {
        this.usersRepository.save(entity);
    }


    @Override
    public void delete(long id_user) {


    }
}

