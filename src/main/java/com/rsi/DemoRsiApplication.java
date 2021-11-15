package com.rsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rsi.controller.UsuarioController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoRsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRsiApplication.class, args);
		System.out.println(" ");
		log.info("----------------------A  R   A  N   C  O  ---------------");
	}

}
