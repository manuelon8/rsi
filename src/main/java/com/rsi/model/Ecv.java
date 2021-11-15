package com.rsi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="TP_ECV_PPC")
public class Ecv implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_ECV_PPC")	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "descripcion",   length = 100)
	private String descripcion;
	
	
	
	public Ecv(String descripcion) {
		super();
		this.descripcion = descripcion;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
