package com.rsi.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto extends BusinessObjectDto implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	
	private int id;	 

	private String codEntidad; 	
	 	
	private String username;	
	
	private String  idProveedor;	
	
	private String  email;
	
    private String password;	

	private int intentosFallidos;

    private String codIdioma;
	

}
