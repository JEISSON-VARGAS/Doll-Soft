package com.app.Doll.Repository;
import com.app.Doll.Entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface RolesRepository extends JpaRepository<RolesEntity , Long >{
}
