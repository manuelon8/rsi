package com.rsi.service;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rsi.dto.LoginDto;
import com.rsi.iservice.IUsuarioService;

@Service("loginService")
public class UsuarioService implements IUsuarioService {
	
	private static final String ERROR= "Error"; 

	@Override
	public String login(@RequestBody  LoginDto login) {
		String respuesta="";
		try {
			
			if(Objects.isNull(login)) {
				respuesta="hay info";
			}else {
				respuesta="no hay info";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return respuesta;
	}

}
