package com.springcloud.example.config;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {

	private static Logger logger = Logger.getLogger(ConfigApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
		logger.info("---------------------ConfigApplication   启动成功-------------------->");
	}
}
