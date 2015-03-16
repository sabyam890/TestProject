package com.saby.controller;

import java.io.IOException;

import junit.framework.Assert;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.saby.messages.RegistrationRequest;
import com.saby.messages.RegistrationResponse;
import com.saby.messages.UserControllerFixture;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class}, loader = AnnotationConfigWebContextLoader.class)
@WebAppConfiguration
public class UserControllerTest {

	@Autowired
	private UserController userController;
	
	@Test
	public void testRegister() throws JsonGenerationException, JsonMappingException, IOException{
		final RegistrationRequest request = new RegistrationRequest();
		final UserControllerFixture fixture = new UserControllerFixture();
		final RegistrationResponse response;
		request.setUserDto(fixture.newUser());
		response = userController.register(request);
		ObjectMapper ob = new ObjectMapper();
		System.out.println(ob.defaultPrettyPrintingWriter().writeValueAsString(request));
		System.out.println(ob.defaultPrettyPrintingWriter().writeValueAsString(response));
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getUserDto());
	}
}
