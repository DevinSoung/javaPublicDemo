package com.springcloud.example.test;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class TestApplication {

	private static Logger logger = Logger.getLogger(TestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println("---------------------TestApplication   启动成功-------------------->");
	}
}
