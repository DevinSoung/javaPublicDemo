package com.springcloud.example.test;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
public class TestApiApplication {

	private static Logger logger = Logger.getLogger(TestApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
		System.out.println("---------------------TestApiApplication   启动成功-------------------->");
	}
}
