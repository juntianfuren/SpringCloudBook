package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class, args);
    }

//    @Configuration
//    public class RestTemplateConfiguration {
//
//        @Bean
//        @LoadBalanced
//        public RestTemplate restTemplate() {
//            return new RestTemplate();
//        }
//
//    }
//
//    @RestController
//    static class TestController {
//
//        @Autowired
//        private RestTemplate restTemplate;
//        @Autowired
//        private LoadBalancerClient loadBalancerClient;
//
//        @GetMapping("/hello")
//        public String hello(String name) {
//            // 获得服务 `demo-provider` 的一个实例
//            ServiceInstance instance = loadBalancerClient.choose("demo-provider");
//            // 发起调用
//            String targetUrl = instance.getUri() + "/echo?name=" + name;
//            String response = restTemplate.getForObject(targetUrl, String.class);
//            // 返回结果
//            return "consumer:" + response;
//        }
//
//        @GetMapping("/hello02")
//        public String hello02(String name) {
//            // 直接使用 RestTemplate 调用服务 `demo-provider`
//            String targetUrl = "http://demo-provider/echo?name=" + name;
//            String response = restTemplate.getForObject(targetUrl, String.class);
//            // 返回结果
//            return "consumer:" + response;
//        }
//
//    }
}