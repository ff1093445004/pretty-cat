package com.pretty.cat.prettycates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrettyCatEsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrettyCatEsApplication.class, args);
	}
}
