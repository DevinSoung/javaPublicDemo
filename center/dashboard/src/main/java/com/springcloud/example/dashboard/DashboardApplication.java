package com.springcloud.example.dashboard;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class DashboardApplication {

	private static Logger logger = Logger.getLogger(DashboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
		logger.info("---------------------ZipkinApplication   启动成功-------------------->");
	}
}
