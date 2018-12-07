package com.pretty.cat.prettycatredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrettyCatRedisApplication {

	public static void main(String[] args) {
		/**
		 * availableProcessors is already set to [4], rejecting [4] 解决netty冲突
		 */
		// System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(PrettyCatRedisApplication.class, args);
	}
}
