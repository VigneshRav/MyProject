package com.edubridge.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
