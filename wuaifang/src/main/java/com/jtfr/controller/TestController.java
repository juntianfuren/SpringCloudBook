package com.jtfr.controller;

import java.lang.invoke.MethodType;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/get")
	public String get() {
		return "get接口";
	}
	
	@PostMapping("/get")
	public String post() {
		return "get接口";
	}
	
}
