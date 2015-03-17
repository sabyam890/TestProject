package com.saby.messages;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("RegistrationRequest")
public class RegistrationRequest {
	
@JsonProperty("userDto")
private UserDto userDto;
@JsonIgnore
public UserDto getUserDto() {
	return userDto;
}

public void setUserDto(UserDto userDto) {
	this.userDto = userDto;
}

}
