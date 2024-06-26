package com.app.Doll.Repository;

import com.app.Doll.Entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity , Long> {
}
