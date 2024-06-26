package com.app.Doll.Repository;


import com.app.Doll.Entity.CompaniesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompaniesRepository extends JpaRepository <CompaniesEntity , Long > {
}
