package com.eureka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.entity.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
