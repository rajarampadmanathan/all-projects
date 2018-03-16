package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Main Spring boot application for config server
 * @author Rajaram
 *
 */
@SpringBootApplication
/*The { EnableConfigServer} annotation defines that this application will
* serve config server that other application can talk for configurations.
* 
* The external repository from where the configuration will be picked up is
* defined in the {application.yml} file.
* */
@EnableConfigServer

/*
 *The @EnableEurekaClient tells the config server to 
 *register itself with a service registry. Config server will also work as client of registry server.
 *
 */
@EnableEurekaClient
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}
}
