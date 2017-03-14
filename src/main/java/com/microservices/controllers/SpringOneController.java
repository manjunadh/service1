package com.microservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringOneController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello from srevice one";
	}

}
