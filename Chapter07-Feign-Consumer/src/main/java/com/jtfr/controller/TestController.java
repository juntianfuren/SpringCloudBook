package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/hello")
	public String hello(String name) {
		// 返回结果
		return "consumer:" + testService.echo(name);
	}

}
