package com.jtfr;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="provider")
public interface MyFeignClient {

	@GetMapping("/hello")
	public String hello();
}
