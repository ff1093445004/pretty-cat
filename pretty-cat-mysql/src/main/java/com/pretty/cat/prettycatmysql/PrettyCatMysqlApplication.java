package com.pretty.cat.prettycatmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrettyCatMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrettyCatMysqlApplication.class, args);
	}

}
