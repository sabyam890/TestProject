package com.saby.service;

import org.springframework.stereotype.Service;

import com.saby.messages.RegistrationResponse;
import com.saby.messages.UserDto;

@Service
public class UserService {

	public RegistrationResponse register(UserDto user){
		
		RegistrationResponse response = new RegistrationResponse();
		response.setUserDto(user);
		return response;
	}
}
