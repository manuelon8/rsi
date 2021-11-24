package com.rsi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rsi.dto.UsuarioDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PPC_USUARIO_PRV")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_USUARIO")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "COD_NRBE_EN")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codEntidad; 
	
	@Column(name = "IND_USER_NAME")	
	private String username;
	
	@Column(name = "ID_PROVEEDOR", length = 4)	
	private String  idProveedor;
	
	@Column(name = "EMAIL", length = 25)	
	private String  email;
	
	@Column(name = "PASSWORD")
    private String password;	
 
	
	@Column(name = "INTENTOS_FALLIDOS")	
	private int intentosFallidos;
 
	@Column(name = "COD_IDIOMA", length = 2)
    private String codIdioma;
 
	
}
