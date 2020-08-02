package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.MyFeignClient;

@RestController
public class ConsumerController {

	@Autowired
	private MyFeignClient myFeignClient;
	
	@GetMapping("/hello")
	public String index() {
		return myFeignClient.hello();
	}
}
