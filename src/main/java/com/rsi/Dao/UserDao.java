package com.rsi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsi.model.User;

public interface UserDao extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
