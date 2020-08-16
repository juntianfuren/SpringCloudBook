package com.jtfr.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/serverName")
	public String serverName() {
		// 调用服务者提供的接口
		ServiceInstance serviceInstance = loadBalancerClient.choose("Chapter06-Consul-Provider");
		URI uri = serviceInstance.getUri();
		String result = restTemplate.getForObject(uri+"/test/serverName", String.class);
		System.out.println("result : "+result);
		return result;
	}
}
