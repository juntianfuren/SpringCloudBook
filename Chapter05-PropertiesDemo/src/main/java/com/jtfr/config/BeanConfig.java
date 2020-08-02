package com.jtfr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {

	@Bean
	@ConfigurationProperties(prefix = "com.get.jtfr")
	public GetJtfr getJtfr() {
		return new GetJtfr();
	}
}
