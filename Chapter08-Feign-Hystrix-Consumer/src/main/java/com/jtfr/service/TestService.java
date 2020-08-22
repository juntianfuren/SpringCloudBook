package com.jtfr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jtfr.component.HelloHystrix;

@FeignClient(name="Chapter07-Ribbon-Provider", fallback=HelloHystrix.class)
public interface TestService {

	/**
	 * 注意：一定要和被调用的http请求一样，同时加上@RequestParam("name")，不然会报错。
	 */
	@GetMapping("/echo") 
	String echo(@RequestParam("name") String name);
	
	/**
	 * 注意：一定要和被调用的http请求一样，同时加上@RequestParam("name")，不然会报错。
	 */
	@GetMapping("/echo2") 
	String echo2(@RequestParam("name") String name);
}
