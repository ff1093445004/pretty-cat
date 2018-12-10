package com.pretty.cat.prettycatproduct.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 禁用feign对hystrix的支持
 */
@Configuration
public class DisableHystrixConfiguration {

	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}
}
