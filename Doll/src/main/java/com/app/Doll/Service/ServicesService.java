package com.app.Doll.Service;
import com.app.Doll.Repository.ServiceRepository;
import com.app.Doll.Service.dao.idao;


import com.app.Doll.Entity.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class ServicesService implements idao<ServiceEntity, Long> {
    @Autowired
    ServiceRepository serviceRepository;


    @Override
    public List<ServiceEntity> findAll() {
        return serviceRepository.findAll();
    }


    @Override
    public ServiceEntity getById(Long id) {
        Optional<ServiceEntity>optionalServiceEntity = serviceRepository.findById(id);
        return optionalServiceEntity.orElse(null);
    }


    @Override
    public void update(ServiceEntity entity) {
        this.serviceRepository.save(entity);
    }


    @Override
    public void save(ServiceEntity entity) {
        this.serviceRepository.save(entity);
    }


    @Override
    public void delete(ServiceEntity entity) {
        this.serviceRepository.delete(entity);
    }


    @Override
    public void create(ServiceEntity entity) {
        this.serviceRepository.save(entity);
    }


    @Override
    public void delete(long id_user) {


    }
}

