package com.app.Doll.Service;
import com.app.Doll.Entity.RolesEntity;
import com.app.Doll.Repository.RolesRepository;
import com.app.Doll.Service.dao.idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class RolesService implements idao<RolesEntity, Long> {
    @Autowired
    private RolesRepository rolesRepository;


    @Override
    public List<RolesEntity> findAll() {
        return rolesRepository.findAll();
    }


    @Override
    public RolesEntity getById(Long id) {
        Optional<RolesEntity>optionalRolesEntity = rolesRepository.findById(id);
        return optionalRolesEntity.orElse(null);
    }


    @Override
    public void update(RolesEntity entity) {
        this.rolesRepository.save(entity);
    }


    @Override
    public void save(RolesEntity entity) {
        this.rolesRepository.save(entity);
    }


    @Override
    public void delete(RolesEntity entity) {
        this.rolesRepository.delete(entity);
    }


    @Override
    public void create(RolesEntity entity) {
        this.rolesRepository.save(entity);
    }


    @Override
    public void delete(long id_user) {


    }
}

