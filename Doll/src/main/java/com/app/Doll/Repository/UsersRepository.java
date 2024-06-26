package com.app.Doll.Repository;
import com.app.Doll.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity , Long>{
}
