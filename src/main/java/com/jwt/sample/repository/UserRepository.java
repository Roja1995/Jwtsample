package com.jwt.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jwt.sample.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	//@Query("SELECT u FROM users u WHERE u.email= ?1")
	Users findByEmail(String email);
}
