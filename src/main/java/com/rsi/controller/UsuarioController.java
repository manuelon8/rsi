package com.rsi.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("users")
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
	
	@PostMapping("/save")
	public @ResponseBody StantarResponseDto save(@RequestBody UsuarioDto user) {
		log.info("Saving a User");
		String r = iusuarioService.newUser(user);
		return new StantarResponseDto(r, user);
	}
	
	@PostMapping("/update")
	public @ResponseBody StantarResponseDto updateUser(@RequestBody UsuarioDto user) {
		log.info("Updating a User");
		String r = iusuarioService.updateUser(user);
		return new StantarResponseDto(r, user);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody StantarResponseDto deleteUser(@PathVariable String id) {
		log.info("Deleting a User");
		String r = iusuarioService.delete(Integer.parseInt(id));
		return new StantarResponseDto(r, null);
	}
 
}
