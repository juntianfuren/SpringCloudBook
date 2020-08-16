package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RestTemplate restTemplate2;
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/hello")
	public String hello(String name) {
		// 获得服务 `demo-provider` 的一个实例                                                     
		ServiceInstance instance = loadBalancerClient.choose("Chapter07-Ribbon-Provider");
		// 发起调用
		String targetUrl = instance.getUri() + "/echo?name=" + name;
		String response = restTemplate2.getForObject(targetUrl, String.class);
		// 返回结果
		return "consumer:" + response;
	}

	@GetMapping("/hello02")
	public String hello02(String name) {
		// 直接使用 RestTemplate 调用服务 `demo-provider`
		String targetUrl = "http://Chapter07-Ribbon-Provider/echo?name=" + name;
		String response = restTemplate.getForObject(targetUrl, String.class);
		// 返回结果
		return "consumer:" + response;
	}

}
