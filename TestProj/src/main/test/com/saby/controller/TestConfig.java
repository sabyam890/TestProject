package com.saby.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.web.WebAppConfiguration;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.saby.controller","com.saby.service"})
public class TestConfig {

	public TestConfig() {
		super();
	}
	

}
