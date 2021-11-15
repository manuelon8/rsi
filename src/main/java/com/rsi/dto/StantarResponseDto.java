package com.rsi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StantarResponseDto implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private String message;
	
	
	private BusinessObjectDto response;
}
