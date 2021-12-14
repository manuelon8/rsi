package com.rsi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsi.dto.UsuarioDto;
import com.rsi.model.User_Suplier;

public interface UsuarioDao extends JpaRepository<User_Suplier, Integer> {
	public List<User_Suplier> findByName(String name);

}
