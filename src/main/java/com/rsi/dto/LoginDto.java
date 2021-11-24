package com.rsi.dto;

import java.io.Serializable;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto extends BusinessObjectDto implements Serializable {
	
	public static final long serialVersionUID = 1L;
	 
		private String codEntidad; 
		
		private String username;
		
		private String password;
		
		private Date loginDate; 
		
		private String ipLogin; 
		
		private String indLogin;

}
