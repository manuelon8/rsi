package com.rsi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsi.model.ERole;
import com.rsi.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
