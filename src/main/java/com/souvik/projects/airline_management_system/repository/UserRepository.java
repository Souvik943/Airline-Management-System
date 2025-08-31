package com.souvik.projects.airline_management_system.repository;

import com.souvik.projects.airline_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.userEmailId = :userEmailId")
    public User findByEmailId(@Param("userEmailId") String userEmailId);
}
