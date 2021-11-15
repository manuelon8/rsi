package com.rsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rsi.dto.LoginDto;
import com.rsi.dto.StantarResponseDto;
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

}
