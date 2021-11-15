package com.rsi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PX_PARAM_PPC")
public class Param implements Serializable{

	    private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "COD_ECV_PPC")	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name = "NOMB_ENT_EN",   length = 36)		 	
		private String nombreEntidad;
		@Column(name = "ID_OFICIAL_EN",   length = 9)
		private String idOficialEntidad;
		@Column(name = "LINK_TERM_COND",   length = 100)
		private String terminosYCondiciones;
		@Column(name = "LINK_LOGO",   length = 45)
		private String logoEntidad;
		
		
		
		public Param(String nombreEntidad, String idOficialEntidad, String terminosYCondiciones, String logoEntidad) {
			super();
			this.nombreEntidad = nombreEntidad;
			this.idOficialEntidad = idOficialEntidad;
			this.terminosYCondiciones = terminosYCondiciones;
			this.logoEntidad = logoEntidad;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombreEntidad() {
			return nombreEntidad;
		}
		public void setNombreEntidad(String nombreEntidad) {
			this.nombreEntidad = nombreEntidad;
		}
		public String getIdOficialEntidad() {
			return idOficialEntidad;
		}
		public void setIdOficialEntidad(String idOficialEntidad) {
			this.idOficialEntidad = idOficialEntidad;
		}
		public String getTerminosYCondiciones() {
			return terminosYCondiciones;
		}
		public void setTerminosYCondiciones(String terminosYCondiciones) {
			this.terminosYCondiciones = terminosYCondiciones;
		}
		public String getLogoEntidad() {
			return logoEntidad;
		}
		public void setLogoEntidad(String logoEntidad) {
			this.logoEntidad = logoEntidad;
		}
		
		
		
		

}
