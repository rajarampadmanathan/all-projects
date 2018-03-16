package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@SpringBootApplication
@EnableEurekaClient
@RestController
//@EnableFeignClients
public class CatalogClientApplication {

	@Autowired
	EurekaClient eurekaClient;
	
	//@Autowired
	//UserClient userClient; 
	
	public static void main(String[] args) {
		SpringApplication.run(CatalogClientApplication.class, args);
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	LoadBalancerClient loadBalancerClient;
	
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
@GetMapping
public String getCatalogService() {
	System.out.println(loadBalancerClient);
	Application a=eurekaClient.getApplication("catalog-service");
	System.out.println(a.getInstances().get(0).getHostName()+":"+a.getInstances().get(0).getPort());
	String url1=a.getInstances().get(0).getHostName()+":"+a.getInstances().get(0).getPort()+"/user/1";
	String url=loadBalancerClient.choose("catalog-service").getUri()+"/user/1";
	System.out.println(url);
	String s =restTemplate.getForObject(url, String.class);
	//String s1 =restTemplate.getForObject(url1, String.class);
	return s;	
}


//@FeignClient("catalog-service")
interface UserClient{
	String sayHello(int userId);
}
}
