package com.rsi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PPC_PASSWORD")
public class Password implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_USUARIO")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "COD_NRBE_EN")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codEntidad;	
	 
    @Column(name = "FECHA_HORA_PWD", nullable = false)
    private String registDate;
    
    @Column(name = "PASSWORD", nullable = false)
    private String passwor;

	public Password(String codEntidad, String registDate, String passwor) {
		super();
		this.codEntidad = codEntidad;
		this.registDate = registDate;
		this.passwor = passwor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodEntidad() {
		return codEntidad;
	}

	public void setCodEntidad(String codEntidad) {
		this.codEntidad = codEntidad;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}
    
    
	
	

}
