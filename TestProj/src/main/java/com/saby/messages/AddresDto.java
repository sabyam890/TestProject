package com.saby.messages;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;


@JsonTypeName("addres")
public class AddresDto {
	
	@JsonProperty("addrline1")
	private String addrline1;

	@JsonProperty("addrline2")
	private String addrline2;

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	@JsonProperty("zip")
	private BigDecimal zip;

	@JsonIgnore
	public String getAddrline1() {
		return addrline1;
	}

	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}

	@JsonIgnore
	public String getAddrline2() {
		return addrline2;
	}

	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}

	@JsonIgnore
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonIgnore
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonIgnore
	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

}
