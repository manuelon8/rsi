package com.rsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsi.dao.UserDao;
import com.rsi.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	
	@Autowired
	UserDao repository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("user nor found by username"+username));
		return  UserDetailsImpl.build(user);
	}

}

/*
 * – UserDetailsService interface has a method to load User by username and returns a UserDetails object that Spring Security can use for authentication and validation.

– UserDetails contains necessary information (such as: username, password, authorities) to build an Authentication object.
 * 
 * 
 * 
 * */
 