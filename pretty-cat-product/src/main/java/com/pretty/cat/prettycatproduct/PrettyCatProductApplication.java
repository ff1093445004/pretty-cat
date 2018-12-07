package com.pretty.cat.prettycatproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrettyCatProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrettyCatProductApplication.class, args);
	}
}
