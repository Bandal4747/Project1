package com.portal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portal.project.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    
    @Query("FROM User where sID =?1")
    User findBySid(int sID);
}
