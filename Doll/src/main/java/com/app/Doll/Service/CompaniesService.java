package com.app.Doll.Service;
import com.app.Doll.Repository.CompaniesRepository;
import com.app.Doll.Service.dao.idao;
import com.app.Doll.Entity.CompaniesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompaniesService implements idao<CompaniesEntity , Long> {
    @Autowired
    private CompaniesRepository companiesRepository;

    @Override
    public List<CompaniesEntity> findAll() {
        return companiesRepository.findAll();
    }

    @Override
    public CompaniesEntity getById(Long id) {
        Optional<CompaniesEntity>optionalCompaniesEntity = companiesRepository.findById(id);
        return optionalCompaniesEntity.orElse(null);
    }

    @Override
    public void update(CompaniesEntity entity) {
        this.companiesRepository.save(entity);
    }

    @Override
    public void save(CompaniesEntity entity) {
        this.companiesRepository.save(entity);
    }

    @Override
    public void delete(CompaniesEntity entity) {
        this.companiesRepository.delete(entity);
    }

    @Override
    public void create(CompaniesEntity entity) {
        this.companiesRepository.save(entity);
    }

    @Override
    public void delete(long id_user) {

    }
}
