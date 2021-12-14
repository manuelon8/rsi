package com.rsi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rsi.dto.LoginDto;
import com.rsi.dto.StantarResponseDto;
import com.rsi.dto.UsuarioDto;
import com.rsi.iservice.IUsuarioService;
import com.rsi.model.User_Suplier;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class UsuarioController {
	
	@Autowired
	public IUsuarioService iusuarioService;
	
	@PostMapping("/login")
	public @ResponseBody StantarResponseDto login(@RequestBody LoginDto login) {
		log.info("Login a User");
		iusuarioService.login(login);
		log.info("Loged User");		
		return new StantarResponseDto("login info user!", login);
	}
	
	@PostMapping("/user")
	public @ResponseBody StantarResponseDto save(@RequestBody UsuarioDto user) {
		log.info("Saving a User");
		String r = iusuarioService.newUser(user);
		return new StantarResponseDto(r, user);
	}
	
	@PostMapping("/user/update")
	public @ResponseBody StantarResponseDto updateUser(@RequestBody UsuarioDto user) {
		log.info("Updating a User");
		String r = iusuarioService.updateUser(user);
		return new StantarResponseDto(r, user);
	}

	@DeleteMapping("/user/{id}")
	public @ResponseBody StantarResponseDto deleteUser(@PathVariable String id) {
		log.info("Deleting a User");
		String r = iusuarioService.delete(Integer.parseInt(id));
		return new StantarResponseDto(r, null);
	}
	
	@GetMapping("/user")
	public @ResponseBody  ResponseEntity<List<User_Suplier>> getAllUser(@RequestParam(required = false) String id) {
		log.info("Get all the Users");
		 
		List<User_Suplier> listado = new ArrayList<>();
		try { 
			listado = iusuarioService.getAllUser(id);
			if(listado.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} 
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 return new ResponseEntity<>(listado, HttpStatus.OK);
	}
	
	@GetMapping("/getuser/{id}")
	public @ResponseBody StantarResponseDto getUser(@PathVariable String id) {
		log.info("Deleting a User");
		String r =  "********EL ID ES: "+ id;//iusuarioService.delete(Integer.parseInt(id));
		return new StantarResponseDto(r, null);
	}
 
}
