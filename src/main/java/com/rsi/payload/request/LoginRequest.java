package com.rsi.payload.request;

import java.util.Set;

import javax.validation.constraints.NotBlank;

import com.rsi.model.Role;
import com.rsi.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
	
	@NotBlank
	private String username;

	@NotBlank
	private String password;

}
