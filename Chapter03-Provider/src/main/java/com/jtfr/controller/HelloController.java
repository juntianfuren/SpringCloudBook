package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${provider.name}")
	private String name;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/hello")
	public String hello() {
		return "provicer:"+name+" port:"+port;
	}
}
