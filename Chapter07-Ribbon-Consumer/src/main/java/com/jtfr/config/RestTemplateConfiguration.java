package com.jtfr.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

	/**
	 * 报错 java.lang.IllegalStateException: No instances available for 10.171.1.115
	 * 创建的 RestTemplate Bean 是添加了 @LoadBalanced 注解，它会把传入的 "10.171.1.115" 当做一个服务，显然是找不到对应的服务实例，所以会报 IllegalStateException 异常。
	 */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Bean
    public RestTemplate restTemplate2() {
    	return new RestTemplate();
    }

}