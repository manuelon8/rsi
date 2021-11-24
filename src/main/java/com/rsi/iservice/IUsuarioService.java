package com.rsi.iservice;

import com.rsi.dto.LoginDto;
import com.rsi.dto.UsuarioDto;

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
	 * @return tring
	 */
	public String updateUser(UsuarioDto user);
	/**
	 * Delete an User  
	 * 
	 * @param int id
	 * @return String
	 */
	public String delete(int iduser);

}
