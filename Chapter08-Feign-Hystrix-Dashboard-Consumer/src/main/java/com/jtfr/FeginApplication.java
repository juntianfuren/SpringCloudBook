package com.jtfr;

import javax.servlet.ServletRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class FeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginApplication.class, args);
	}

	/**
	 * 配置 servletSpring Boot 版本需要配置 servlet
	 */
	@Bean
	public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/actuator/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}

	// @Configuration
	// public class RestTemplateConfiguration {
	//
	// @Bean
	// @LoadBalanced
	// public RestTemplate restTemplate() {
	// return new RestTemplate();
	// }
	//
	// }
	//
	// @RestController
	// static class TestController {
	//
	// @Autowired
	// private RestTemplate restTemplate;
	// @Autowired
	// private LoadBalancerClient loadBalancerClient;
	//
	// @GetMapping("/hello")
	// public String hello(String name) {
	// // 获得服务 `demo-provider` 的一个实例
	// ServiceInstance instance = loadBalancerClient.choose("demo-provider");
	// // 发起调用
	// String targetUrl = instance.getUri() + "/echo?name=" + name;
	// String response = restTemplate.getForObject(targetUrl, String.class);
	// // 返回结果
	// return "consumer:" + response;
	// }
	//
	// @GetMapping("/hello02")
	// public String hello02(String name) {
	// // 直接使用 RestTemplate 调用服务 `demo-provider`
	// String targetUrl = "http://demo-provider/echo?name=" + name;
	// String response = restTemplate.getForObject(targetUrl, String.class);
	// // 返回结果
	// return "consumer:" + response;
	// }
	//
	// }
}