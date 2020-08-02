package com.jtfr.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="com.jtfr")
public class Jtfr {
	private String name;
	private String age;
	private List<String> address;
}
