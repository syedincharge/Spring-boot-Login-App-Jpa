package com.rizvi.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rizvi.spring.model.User;
import com.rizvi.spring.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
	
	
}
