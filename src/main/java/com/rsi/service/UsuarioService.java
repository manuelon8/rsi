package com.rsi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rsi.controller.UsuarioController;
import com.rsi.dao.UsuarioDao;
import com.rsi.dto.LoginDto;
import com.rsi.dto.UsuarioDto;
import com.rsi.exception.ResourceNotFoundException;
import com.rsi.iservice.IUsuarioService;
import com.rsi.model.User_Suplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("loginService")
public class UsuarioService implements IUsuarioService {
	
	private static final String ERROR= "Error"; 
	
	@Autowired
	private UsuarioDao service;

	@Override
	public String login(LoginDto login) {
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
	@Override
	public String newUser(UsuarioDto user) {
		String respuesta="";
		try {
			if(user.getEmail()==null && user.getCodEntidad()==null && user.getUsername()==null && user.getPassword()==null){					 			
				respuesta="Datos de usuario incompletos";
				log.warn("La informacion del usuario no es completa");
			}else {
				ModelMapper modelMapper = new ModelMapper();
				User_Suplier entity = modelMapper.map(user, User_Suplier.class);
				service.save(entity);
				log.info("Se almaceno un nuevo Usuario");
				respuesta="Usuario guardado con exito";
			}
		} catch (Exception e) {
			log.warn("La informacion del usuario no es completa");			
			throw new ResourceNotFoundException("User not found userId= " + user.getId());
		}		
		return respuesta;
	}
	@Override
	public String updateUser(UsuarioDto user) {
		String respuesta="";
		try {
			if(user!=null) {
				User_Suplier entity = service.getById(user.getId());
				entity.setEmail(user.getEmail());
				entity.setPassword(user.getPassword());
				entity.setName(user.getUsername());
				service.save(entity);
				log.info("Se actualizo el  Usuario");
				respuesta="Usuario guardado con exito";
			}	
			else {
				respuesta="Datos de usuario incompletos";
				log.warn("La informacion del usuario no es completa");
			}
		} catch (Exception e) {
			log.warn("La informacion del usuario no es completa");			
			throw new ResourceNotFoundException("User not found userId= " + user.getId());
		}
		return respuesta;
	}
	@Override
	public String delete(int iduser) {
		String respuesta="";
		try {
			if(iduser>0) {
				service.deleteById(iduser);
				log.info("Se Elimino el  Usuario");
				respuesta="Usuario eliminado con exito";
			}
			else {
				respuesta="Datos de usuario incompletos";
				log.warn("La informacion del usuario no es completa");
			}
		} catch (Exception e) {
			log.warn("La informacion del usuario no es completa");			
			throw new ResourceNotFoundException("User not found userId= " + iduser);
		}
		return respuesta;
	}
		
	@Override
	public List<User_Suplier> getAllUser(String nombre) {
		List<User_Suplier> listado = new ArrayList<>();
		
		try {
			if(nombre==null) {
				 service.findAll().forEach(listado::add);				 
			}
			else {
				service.findByName(nombre).forEach(listado::add);				 
			}
		} catch (Exception e) {
			log.warn("La informacion del usuario no es completa");			
			throw new ResourceNotFoundException("Users not found"); 
		}
		return listado;
	}
 

}
