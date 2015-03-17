package com.saby.messages;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("userDetails")
public class UserDetailsDto {
	
	@JsonProperty("constituincy")
	private String constituincy;

	@JsonProperty("email")
	private String email;

	@JsonProperty("firstname")
	private String firstname;

	@JsonProperty("lastname")
	private String lastname;

	@JsonProperty("phonenumber")
	private String phonenumber;

	@JsonProperty("status")
	private String status;

	@JsonIgnore
	public String getConstituincy() {
		return constituincy;
	}

	public void setConstituincy(String constituincy) {
		this.constituincy = constituincy;
	}

	@JsonIgnore
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@JsonIgnore
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonIgnore
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@JsonIgnore
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
