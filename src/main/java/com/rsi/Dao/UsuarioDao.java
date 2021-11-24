package com.rsi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsi.dto.UsuarioDto;
import com.rsi.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

}
