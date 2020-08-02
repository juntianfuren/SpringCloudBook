package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.entity.User;

@RestController
public class TestController {

	@Autowired
	private User user;
	
	@GetMapping("/test")
	@ResponseBody
	public String testMethod() {
		return "testMethod"+user.getName();
	}
}
