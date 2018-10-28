package com.spring.maven.webservice.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class ApplicationWebService {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getWelcomeMessage() {

		return "HEllo";
	}
	
}
