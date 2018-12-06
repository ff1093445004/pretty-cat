package com.pretty.cat.prettycatscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PrettyCatSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrettyCatSchedulerApplication.class, args);
	}
}
