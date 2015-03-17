package com.saby.messages;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("userDto")
public class UserDto {
	
	@JsonProperty("addres")
	private AddresDto addresDto;
	
	@JsonProperty("loginCredentials")
	private UserLoginDto userLoginDto;
	
	@JsonProperty("userDetails")
	private UserDetailsDto userDetailsDto;
	
	public AddresDto getAddresDto() {
		return addresDto;
	}
	public void setAddresDto(AddresDto addresDto) {
		this.addresDto = addresDto;
	}
	public UserLoginDto getUserLoginDto() {
		return userLoginDto;
	}
	public void setUserLoginDto(UserLoginDto userLoginDto) {
		this.userLoginDto = userLoginDto;
	}
	public UserDetailsDto getUserDetailsDto() {
		return userDetailsDto;
	}
	public void setUserDetailsDto(UserDetailsDto userDetailsDto) {
		this.userDetailsDto = userDetailsDto;
	}
	
}
