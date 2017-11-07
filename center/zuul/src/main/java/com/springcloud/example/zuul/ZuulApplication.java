package com.springcloud.example.registry;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {

	private static Logger logger = Logger.getLogger(ZuulApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
		logger.info("---------------------ZuulApplication   启动成功-------------------->");
	}
}
