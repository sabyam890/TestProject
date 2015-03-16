package com.saby.messages;

import java.math.BigDecimal;

public class UserControllerFixture {

	public UserDto newUser(){
		
		final UserDto userDto = new UserDto();
		populateAddres(userDto);
		populateUserDetails(userDto);
		populateUserLogin(userDto);
		return userDto;
	}

	private void populateUserLogin(UserDto userDto) {
		final UserLoginDto userLogin = new UserLoginDto();
		userLogin.setUsername("saby");
		userLogin.setPassword("saby");
		userDto.setUserLoginDto(userLogin);
	}

	private void populateUserDetails(UserDto userDto) {
		UserDetailsDto userDetails = new UserDetailsDto();
		userDetails.setFirstname("Sabyasachi");
		userDetails.setLastname("Mukherjee");
		userDetails.setEmail("sabyam8@live.in");
		userDetails.setPhonenumber("9474540063");
		userDetails.setConstituincy("Kolkata");
		userDetails.setStatus("Registered");
		userDto.setUserDetailsDto(userDetails);
	}

	private void populateAddres(UserDto userDto) {
		AddresDto addres = new AddresDto();
		addres.setAddrline1("D 12, Mohini Apartment");
		addres.setAddrline2("Mohish Gote, Krishnapur Road");
		addres.setCity("Kolkata");
		addres.setState("WB");
		addres.setZip(new BigDecimal(700102));
		userDto.setAddresDto(addres);
	}
}
