package com.saby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saby.messages.RegistrationRequest;
import com.saby.messages.RegistrationResponse;
import com.saby.service.UserService;

@RestController
@RequestMapping("/service/user")
public class UserController {

	@Autowired
	private UserService service;
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public RegistrationResponse register(@RequestBody final RegistrationRequest request) {
		
		return service.register(request.getUserDto());
	}
}
