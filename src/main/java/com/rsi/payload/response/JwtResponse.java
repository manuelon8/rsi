package com.rsi.payload.response;

import java.util.List;
import java.util.Set;

import com.rsi.model.Role;
import com.rsi.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
	
	private String token;	
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
	private String type = "Bearer";

}
