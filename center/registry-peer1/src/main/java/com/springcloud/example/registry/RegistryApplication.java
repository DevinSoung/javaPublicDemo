package com.springcloud.example.registry;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {

	private static Logger logger = Logger.getLogger(RegistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
		logger.info("---------------------RegistryApplication peer1   启动成功-------------------->");
	}
}
