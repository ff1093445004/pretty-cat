package com.pretty.cat.prettycatscheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductScheduler {

	private static Logger LOGGER = LoggerFactory.getLogger(ProductScheduler.class);

	@Scheduled(cron = "0/30 * * * * *")
	public void sycProduct() {
		LOGGER.info("==============job start!!!!!!!!!!!==============");
		LOGGER.info("============================");
		LOGGER.info("==============job end!!!!!!!!!!!==============");
	}
}
