package com.jtfr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("Chapter07-Ribbon-Provider")
public interface TestService {

	/**
	 * 注意：一定要和被调用的http请求一样，同时加上@RequestParam("name")，不然会报错。
	 */
	@GetMapping("/echo") // 如果Config里面配置了使用Feign注解，这里的注解就不能用了
	String echo(@RequestParam("name") String name);
	// @RequestLine("GET /echo") // 好像提供不了参数调用，但是又有注解，以后再看了。
	// String echo(@Param("name") String name);
}
