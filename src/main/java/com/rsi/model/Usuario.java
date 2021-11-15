package com.rsi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PPC_USUARIO_PRV")
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_USUARIO")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "COD_NRBE_EN")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codEntidad;
	@Column(name = "COD_ECV_PPC")	
	private int codecvppc;
	
	@Column(name = "IND_USUARIO_PPAL")	
	private String usuarioPrincipal;
	
	@Column(name = "ID_PROVEEDOR", length = 15, nullable = false)	
	private String  idProveedor;
	
	@Column(name = "EMAIL", length = 50, nullable = false)	
	private String  email;
	
	@Column(name = "PASSWORD", nullable = false)
    private String passwor;
	
	@Column(name = "IND_RESETEAR_PASSWORD",length = 1, nullable = false)
    private String resetearPassword;
	
	@Column(name = "INTENTOS_FALLIDOS")	
	private int intentosFallidos;
	
	@Column(name = "IND_EMAIL_VALIDADO",length = 1)	
	private int emailValidado;	
	
	@Column(name = "COD_IDIOMA", length = 2, nullable = false)
    private String codIdioma;
	
	@Column(name = "TELEFONO", length = 9, nullable = false)
    private String telefono;
	
	@Column(name = "ALIAS", length = 50, nullable = false)
    private String alias;
	
    @Column(name = "FECHA_HORA_PWD", nullable = false)
    private String registDate;
	
}
