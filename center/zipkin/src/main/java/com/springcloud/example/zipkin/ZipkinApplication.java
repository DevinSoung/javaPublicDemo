package com.springcloud.example.zipkin;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinApplication {

	private static Logger logger = Logger.getLogger(ZipkinApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
		logger.info("---------------------ZipkinApplication   启动成功-------------------->");
	}
}
