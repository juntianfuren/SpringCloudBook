package com.jtfr.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name = "12345";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
