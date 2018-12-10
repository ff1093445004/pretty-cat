package com.pretty.cat.prettycates;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrettyCatEsApplicationTests {

	@Value("${zhm.num}")
	private String value;
	
	@Test
	public void contextLoads() {
		System.out.println(value);
	}

}
