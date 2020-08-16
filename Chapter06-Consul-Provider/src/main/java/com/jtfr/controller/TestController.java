package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	@Value("${provider.name}")
	private String serverName;

	@GetMapping("/serverName")
	public String serverName() {
		return serverName;
	}
}
