package com.rsi.iservice;

import java.util.List;

import com.rsi.dto.LoginDto;
import com.rsi.dto.UsuarioDto;
import com.rsi.model.User_Suplier;

public interface IUsuarioService {
	
	public String login(LoginDto login);
	/**
	 * Create an User 
	 * 
	 * @param UsuarioDto
	 * @return String
	 */
	public String newUser(UsuarioDto user);
	/**
	 * Update an User  
	 * 
	 * @param UsuarioDto
	 * @return String
	 */
	public String updateUser(UsuarioDto user);
	/**
	 * Delete an User  
	 * 
	 * @param int id
	 * @return String
	 */
	public String delete(int iduser);
	/**
	 * Get all User  
	 * 
	 * @param name
	 * @return String
	 */
	public List<User_Suplier> getAllUser(String nombre);

}
