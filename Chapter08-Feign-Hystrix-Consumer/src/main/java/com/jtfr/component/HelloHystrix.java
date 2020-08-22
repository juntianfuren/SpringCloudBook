package com.jtfr.component;

import org.springframework.stereotype.Component;

import com.jtfr.service.TestService;

@Component
public class HelloHystrix implements TestService {

	@Override
	public String echo(String name) {
		return "echo熔错";
	}

	@Override
	public String echo2(String name) {
		return "echo2熔错";
	}

}
