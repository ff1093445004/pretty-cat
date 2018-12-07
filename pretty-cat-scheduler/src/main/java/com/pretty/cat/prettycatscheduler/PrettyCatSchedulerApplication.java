package com.pretty.cat.prettycatscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableEurekaClient
@EnableScheduling
@SpringBootApplication
public class PrettyCatSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrettyCatSchedulerApplication.class, args);
	}
}
