package com.rsi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PPC_LOGIN")
public class Login implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_USUARIO")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "COD_NRBE_EN")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codEntidad;
	
	 @Column(name = "FECHA_HORA_LOGIN", nullable = false)
	 private Date loginDate;
	 
	 @Column(name = "IP_LOGIN", nullable = false)
	 private String ipLogin;
	 
	 @Column(name = "IND_LOGIN", nullable = false)
	 private String indLogin;
	 
	 

	public Login(String codEntidad, Date loginDate, String ipLogin, String indLogin) {
		super();
		this.codEntidad = codEntidad;
		this.loginDate = loginDate;
		this.ipLogin = ipLogin;
		this.indLogin = indLogin;
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

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getIpLogin() {
		return ipLogin;
	}

	public void setIpLogin(String ipLogin) {
		this.ipLogin = ipLogin;
	}

	public String getIndLogin() {
		return indLogin;
	}

	public void setIndLogin(String indLogin) {
		this.indLogin = indLogin;
	}
	 
	 

}
